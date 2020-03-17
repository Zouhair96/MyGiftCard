package org.gift.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Panier {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double total;
	private int nombre;
	
	@OneToMany(mappedBy = "panier")
	private Collection<Carte> cartes;
	
	@OneToOne(mappedBy = "panier")
    private AppUser user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public Collection<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(Collection<Carte> cartes) {
		this.cartes = cartes;
	}

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}

	public Panier(Long id, double total, int nombre, Collection<Carte> cartes, AppUser user) {
		super();
		this.id = id;
		this.total = total;
		this.nombre = nombre;
		this.cartes = cartes;
		this.user = user;
	}

	public Panier() {
		super();
	}
	
	
	

}
