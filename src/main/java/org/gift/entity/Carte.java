package org.gift.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carte  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	
	private String nom;
	private String description;
	private String nomPhoto;
	private double prix;
	private boolean nouveau;
	private boolean valable;
	public Carte() {
		super();
	}
	public Carte(Long id, String nom, String description, String nomPhoto, double prix, boolean nouveau,
			boolean valable) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.nomPhoto = nomPhoto;
		this.prix = prix;
		this.nouveau = nouveau;
		this.valable = valable;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNomPhoto() {
		return nomPhoto;
	}
	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public boolean isNouveau() {
		return nouveau;
	}
	public void setNouveau(boolean nouveau) {
		this.nouveau = nouveau;
	}
	public boolean isValable() {
		return valable;
	}
	public void setValable(boolean valable) {
		this.valable = valable;
	}

}
