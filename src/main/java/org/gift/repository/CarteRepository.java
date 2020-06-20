package org.gift.repository;

import java.util.List;

import org.gift.entity.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
@RepositoryRestResource
public interface CarteRepository extends JpaRepository<Carte , Long>{
	
	@RestResource(path ="/cartes")
	public List<Carte> findByNomContains(@Param("mc") String mc);
	
	@RestResource(path ="/asc")
	public List<Carte> findByOrderByPrixAsc();
	


}
