package org.gift.web;



import org.gift.entity.AppUser;
import org.gift.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
	
	@Autowired
	private AccountService accountService;
	@PostMapping("/register")
	public AppUser register(@RequestBody UserForm userForm,AppUser appUser) {
		return accountService.saveUser(
				userForm.getUsername(),userForm.getPassword(),userForm.getConfirmedPassword());
		
	}

}
@Data
 class UserForm{
	 private String username;
	 private String password;
	 private String confirmedPassword;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmedPassword() {
		return confirmedPassword;
	}
	public void setConfirmedPassword(String confirmedPassword) {
		this.confirmedPassword = confirmedPassword;
	}



 }