package org.gift.repository;


import org.gift.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
	public AppRole findByRoleName(String rolename);



}
