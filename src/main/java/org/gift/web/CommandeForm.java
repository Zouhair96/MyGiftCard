package org.gift.web;


import lombok.Data;

import org.gift.entity.AppUser;

import java.util.ArrayList;
import java.util.List;
@Data
public class CommandeForm {
    private AppUser appUser=new AppUser();
    private List<CommandeCartes> cartes=new ArrayList<>();
	public AppUser getAppUser() {
		return appUser;
	}
	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}
	public List<CommandeCartes> getCartes() {
		return cartes;
	}
	public void setCartes(List<CommandeCartes> cartes) {
		this.cartes = cartes;
	}
    
}
@Data
class CommandeCartes{
    private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    

}