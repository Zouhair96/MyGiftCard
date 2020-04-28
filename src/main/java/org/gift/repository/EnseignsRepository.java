package org.gift.repository;

import java.util.List;

import org.gift.entity.Enseign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface EnseignsRepository extends JpaRepository<Enseign, Long> {
	@RestResource(path ="/enseign")
	public List<Enseign> findByMarqueContains(@Param("mc") String mc);
}
