package com.gestibank.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CL")
@Table(name="Client")
public class Client extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adresse;
	private int nbenfants;
	
	@OneToMany (mappedBy="client",fetch=FetchType.LAZY)
	private Collection<Compte> compte;
//	@OneToOne
//	private Utilisateur utilisateur;
	
	public Client() {
		super();
	}

	public Client(String adresse, int nbenfants) {
		super();
		this.adresse = adresse;
		this.nbenfants = nbenfants;
	}


	public Client(String nom, String prenom, String email, String motdepass, String telephone,
			String pseudonyme) {
		super(nom, prenom, email, motdepass, telephone, pseudonyme);
		// TODO Auto-generated constructor stub
	}


	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNbenfants() {
		return nbenfants;
	}
	public void setNbenfants(int nbenfants) {
		this.nbenfants = nbenfants;
	}
	
}
