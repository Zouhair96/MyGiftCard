package org.gift.repository;

import java.util.List;

import org.gift.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
@RepositoryRestResource
public interface CategoriesRepository extends JpaRepository<Categorie , Long>{
	@RestResource(path ="/cat")
	public List<Categorie> findByNameContains(@Param("mc") String mc);
}
