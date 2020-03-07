package org.gift.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@OneToOne
	@JoinColumn(name = "carte_id", referencedColumnName = "id")
	private Carte carte;
	 
	public Enseign() {
		super();
	}

	public Enseign(String marque, String adress, String gmail, int tel, Carte carte) {
		super();
		this.marque = marque;
		this.adress = adress;
		this.gmail = gmail;
		this.tel = tel;
		this.carte = carte;
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

	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	
	
}
