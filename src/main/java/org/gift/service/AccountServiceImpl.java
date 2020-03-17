package org.gift.service;


import javax.transaction.Transactional;

import org.gift.entity.AppRole;
import org.gift.entity.AppUser;
import org.gift.repository.AppRoleRepository;
import org.gift.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AppUserRepository appUserRepository;
	@Autowired
	private AppRoleRepository appRoleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public AppUser saveUser(String username, String password, String confirmedPassword) {
		AppUser user=appUserRepository.findByUsername(username);
		if(user!=null)throw new RuntimeException("user already exisst");
		if(!password.equals(confirmedPassword))throw new RuntimeException("Please confirme your pasword");
		AppUser appUser = new AppUser();
		appUser.setUsername(username);
		appUser.setActivated(true);
		appUser.setPassword(bCryptPasswordEncoder.encode(password));
		appUserRepository.save(appUser);
		addRoleToUser(username,"USER");
		
		return appUser;
	}

	@Override
	public AppRole save(AppRole role) {
		// TODO Auto-generated method stub
		return appRoleRepository.save(role);
	}

	@Override
	public AppUser loadUserByUsername(String username) {
		// TODO Auto-generated method stub
		return appUserRepository.findByUsername(username);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
		AppUser appUser=appUserRepository.findByUsername(username);
		AppRole appRole=appRoleRepository.findByRoleName(rolename);
		appUser.getRoles().add(appRole);
	}

}
