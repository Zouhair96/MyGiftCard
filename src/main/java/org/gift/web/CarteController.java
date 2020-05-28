package org.gift.web;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.gift.entity.Carte;
import org.gift.repository.CarteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin("*")
@RestController
public class CarteController {
	
    private CarteRepository carteRepository;

	   @PostMapping(path = "/uploadPhoto")
	    public void uploadPhoto(MultipartFile file, @PathVariable Long id) throws Exception{
	       Carte c=carteRepository.findById(id).get();
	       c.setPhoto(file.getOriginalFilename());
	       Files.write(Paths.get(System.getProperty("user.home")+"/ecom/products/"+c.getPhoto()),file.getBytes());
	       carteRepository.save(c);
	    }

}
