package org.gift.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
	
	@OneToOne(mappedBy = "carte")
    private Enseigns enseigns;
	
	public Carte() {
		super();
	}

	public Carte(String nom, String description, String nomPhoto, double prix, boolean nouveau, boolean valable,
			Enseigns enseigns) {
		super();
		this.nom = nom;
		this.description = description;
		this.nomPhoto = nomPhoto;
		this.prix = prix;
		this.nouveau = nouveau;
		this.valable = valable;
		this.enseigns = enseigns;
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
	public Enseigns getEnseigns() {
		return enseigns;
	}
	public void setEnseigns(Enseigns enseigns) {
		this.enseigns = enseigns;
	}
	

}
