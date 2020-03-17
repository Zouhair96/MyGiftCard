package org.gift;

import java.util.stream.Stream;

import org.gift.entity.AppRole;
import org.gift.entity.Carte;
import org.gift.entity.Categorie;
import org.gift.entity.Enseign;
import org.gift.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class GiftCardBackEndApplication implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(GiftCardBackEndApplication.class, args);
	}
	/*@Bean 
	CommandLineRunner start(AccountService accountService) {
		return args->{
				accountService.save(new AppRole(null,"USER"));
				accountService.save(new AppRole(null,"ADMIN"));
				Stream.of("user1","user2","user3","admin").forEach(un->{
					accountService.saveUser(un,"1234","1234");
				});
				accountService.addRoleToUser("admin","ADMIN");
		};
	}*/
	@Bean
	BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
		 repositoryRestConfiguration.exposeIdsFor(Carte.class, Categorie.class, Enseign.class);
		
	}
	

}
