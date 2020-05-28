package org.gift.repository;


import org.gift.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("*")
@RepositoryRestResource
public interface AppUserRepository extends JpaRepository<AppUser,Long>{
	public AppUser findByUsername(String username);

}
