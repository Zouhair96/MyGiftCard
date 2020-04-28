package org.gift.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Enseign {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String marque;
	private String adress;
	private String gmail;
	private int tel;
	private String photo;
	
	@OneToMany(mappedBy = "enseign")
	private Collection<Carte> cartes;
	 
	public Enseign() {
		super();
	}

	public Enseign(Long id, String marque, String adress, String gmail, int tel, String photo,
			Collection<Carte> cartes) {
		super();
		this.id = id;
		this.marque = marque;
		this.adress = adress;
		this.gmail = gmail;
		this.tel = tel;
		this.photo = photo;
		this.cartes = cartes;
	}

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Collection<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(Collection<Carte> cartes) {
		this.cartes = cartes;
	}


	
	
}
