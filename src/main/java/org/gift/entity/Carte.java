package org.gift.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private double prix;
	private int quantity;
	private boolean print;
	
	
	@ManyToOne
	private Enseign enseign;
	
	
	@ManyToOne
	private Categorie categorie;
	
	@OneToMany(mappedBy = "carte", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<LigneCommande> ligneCommandes;
	
	public Carte() {
		super();
	}

	

	public Carte(Long id, String nom, String description, String photo, double minPrix, double maxPrix, double prix,
			int quantity, boolean print, Enseign enseign, Categorie categorie, Set<LigneCommande> ligneCommandes) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.photo = photo;
		this.minPrix = minPrix;
		this.maxPrix = maxPrix;
		this.prix = prix;
		this.quantity = quantity;
		this.print = print;
		this.enseign = enseign;
		this.categorie = categorie;
		this.ligneCommandes = ligneCommandes;
	}



	public boolean isPrint() {
		return print;
	}



	public void setPrint(boolean print) {
		this.print = print;
	}



	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
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

	public Set<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}


}
