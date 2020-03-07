package org.gift.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Carte  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	
	private String nom;
	private String description;
	private String photo;
	private double minPrix;
	private double maxPrix;
	
	
	@OneToOne(mappedBy = "carte")
    private Enseign enseign;
	
	@ManyToOne
	private Categorie categorie;
	
	public Carte() {
		super();
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

	public String getphoto() {
		return photo;
	}

	public void setphoto(String photo) {
		this.photo = photo;
	}

	public double getMinPrix() {
		return minPrix;
	}

	public void setMinPrix(double minPrix) {
		this.minPrix = minPrix;
	}

	public double getMaxPrix() {
		return maxPrix;
	}

	public void setMaxPrix(double maxPrix) {
		this.maxPrix = maxPrix;
	}

	public Enseign getEnseign() {
		return enseign;
	}

	public void setEnseign(Enseign enseign) {
		this.enseign = enseign;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Carte(Long id, String nom, String description, String photo, double minPrix, double maxPrix, Enseign enseign,
			Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.photo = photo;
		this.minPrix = minPrix;
		this.maxPrix = maxPrix;
		this.enseign = enseign;
		this.categorie = categorie;
	}

	
	

}
