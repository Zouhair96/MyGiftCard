package org.gift.repository;

import org.gift.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
@RepositoryRestResource
public interface CategoriesRepository extends JpaRepository<Categorie , Long>{

}
