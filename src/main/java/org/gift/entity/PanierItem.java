package org.gift.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PanierItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "panier_id", nullable = false)
	 private Panier panier;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "Carte_id", nullable = false)
	 private Carte carte;
	 
	 @Column(name = "Quanity", nullable = false)
	 private int quanity;
	 
	 @Column(name = "Price", nullable = false)
	 private double price;
	 
	 @Column(name = "Amount", nullable = false)
	 private double amount;
	 
	 
	 

	public PanierItem() {
		super();
	}

	public PanierItem(Long id,Panier panier, Carte carte, int quanity, double price,
			double amount) {
		super();
		this.id = id;
		
		this.panier = panier;
		this.carte = carte;
		this.quanity = quanity;
		this.price = price;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	 
	 
	 
	 

}
