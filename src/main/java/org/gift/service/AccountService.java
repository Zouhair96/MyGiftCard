package org.gift.service;

import org.gift.entity.AppRole;
import org.gift.entity.AppUser;

public interface AccountService {
	public AppUser saveUser(String username,String password,String confirmedPassword) ;
	public AppRole save(AppRole role);
	public AppUser loadUserByUsername(String Username);
	public void addRoleToUser(String username,String rolename);

}
