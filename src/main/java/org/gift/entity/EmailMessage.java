package org.gift.entity;

public class EmailMessage {

	private String destinateur;
	private String sujet;

	private String body;
	public String getDestinateur() {
		return destinateur;
	}
	public void setDestinateur(String destinateur) {
		this.destinateur = destinateur;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public EmailMessage(String destinateur, String sujet, 
			String body) {
		super();
		this.destinateur = destinateur;
		this.sujet = sujet;
	
		this.body = body;
	}
	public EmailMessage() {
		super();
	}

	
	
	
}
