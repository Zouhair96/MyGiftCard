package org.gift.web;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.gift.entity.EmailMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class MailController {
	
	
	private String username = "zouhair.benali96@gmail.com";
	
	private String password = "sahbiyazou1996";
	
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String senEmail(@RequestBody EmailMessage emailmessage) throws AddressException, MessagingException, IOException {
		senmail(emailmessage);
		return "Email sent succefully";
		
	}
	public void senmail(EmailMessage emailmessage) throws AddressException, MessagingException, IOException {
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(username,password);
		}
		});
		
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(username, false));
		
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailmessage.getDestinateur()));
		msg.setSubject(emailmessage.getSujet());
		msg.setContent(emailmessage.getBody(),"text/html");
		msg.setSentDate(new Date());
		
		MimeBodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent(emailmessage.getBody(), "text/html");
		
		Multipart multipart	= new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);
		MimeBodyPart attachPart = new MimeBodyPart();
		
		attachPart.attachFile("C:\\xampp\\htdocs\\images\\giftcards\\image.png");
		
		multipart.addBodyPart(attachPart);
		msg.setContent(multipart);
		//send email 
		Transport.send(msg);
	}

}
