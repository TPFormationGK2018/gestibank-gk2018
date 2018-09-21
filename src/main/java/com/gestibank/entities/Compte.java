package com.gestibank.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="COMPTE_TYPE")
@Table(name="COMPTE")
public class Compte implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String rib;
	private Date dateCreation;
	private double solde;
	
	
	@ManyToOne
	@JoinColumn(name="CODE_CLI")
	private Client client;
	@ManyToOne
	@JoinColumn(name="CODE_CONS")
	private Conseiller conseiller;
	
	@OneToMany
	private Collection<Transactions> transaction;
	
	public Compte() {
		super();
	}

	public Compte(String rib, Date dateCreation, double solde, Client client, Conseiller conseiller) {
		super();
		this.rib = rib;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
		this.conseiller = conseiller;
	}

	public String getRip() {
		return rib;
	}

	public void setRip(String string) {
		this.rib = string;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	
}
