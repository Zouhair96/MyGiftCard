package org.gift.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@ManyToOne
	private AppUser user;
	
	
	@OneToMany(mappedBy = "commande", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<LigneCommande> ligneCommandes;

	public Commande() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Commande(Long id, String name, AppUser user, Set<LigneCommande> ligneCommandes) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.ligneCommandes = ligneCommandes;
	}





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}


	public Set<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}


	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	
	
}
