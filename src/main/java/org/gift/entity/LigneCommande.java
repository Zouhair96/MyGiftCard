package org.gift.entity;

import javax.persistence.*;

@Entity
public class LigneCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "commande_id", nullable = false)
    private Commande commande;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "carte_id", nullable = false)
    private Carte carte;
	

	public LigneCommande() {
		super();
	}
	public LigneCommande(Long id, Commande commande, Carte carte) {
		super();
		this.id = id;
		this.commande = commande;
		this.carte = carte;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Carte getCarte() {
		return carte;
	}
	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	
	

}
