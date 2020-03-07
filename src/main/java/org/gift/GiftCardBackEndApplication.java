package org.gift;

import org.gift.entity.Carte;
import org.gift.entity.Categorie;
import org.gift.entity.Enseign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class GiftCardBackEndApplication implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(GiftCardBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 repositoryRestConfiguration.exposeIdsFor(Carte.class, Categorie.class, Enseign.class);
		
	}
	

}
