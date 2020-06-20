package org.gift.web;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.gift.entity.Carte;
import org.gift.repository.CarteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.http.MediaType;

@CrossOrigin("*")
@RestController
public class CarteController {
	
    private CarteRepository carteRepository;

	   
	    public CarteController(CarteRepository carteRepository) {
	        this.carteRepository = carteRepository;
	    }
	    @GetMapping(path="/photoCarte/{id}",produces = MediaType.IMAGE_PNG_VALUE)
	    public byte[] getPhoto( Long id) throws Exception{
	        Carte p=carteRepository.findById(id).get();
	        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/giftcards/"+p.getPhoto()));
	    }
	    @PostMapping(path = "/uploadPhoto/{id}")
	    public void uploadPhoto(MultipartFile file, @PathVariable Long id) throws Exception{
	       Carte p=carteRepository.findById(id).get();
	       p.setPhoto(file.getOriginalFilename());
	       Files.write(Paths.get(System.getProperty("user.home")+"/ecom/products/"+p.getPhoto()),file.getBytes());
	       carteRepository.save(p);
	    }

}
