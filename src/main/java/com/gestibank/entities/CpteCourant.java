package com.gestibank.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CC")
@Table(name="CpteCourant")
public class CpteCourant extends Compte {
	private static final long serialVersionUID = 1L;
	private double mtAutorise;
	private double tauxDecouvert;
	
	public CpteCourant() {
		super();
	}

	public CpteCourant(double mtAutorise, double tauxDecouvert) {
		super();
		this.mtAutorise = mtAutorise;
		this.tauxDecouvert = tauxDecouvert;
	}

	public CpteCourant(String rip, Date dateCreation, double solde, Client client, Conseiller conseiller) {
		super(rip, dateCreation, solde, client, conseiller);
		// TODO Auto-generated constructor stub
	}

	public double getMtAutorise() {
		return mtAutorise;
	}

	public void setMtAutorise(double mtAutorise) {
		this.mtAutorise = mtAutorise;
	}

	public double getTauxDecouvert() {
		return tauxDecouvert;
	}

	public void setTauxDecouvert(double tauxDecouvert) {
		this.tauxDecouvert = tauxDecouvert;
	}
	
}
