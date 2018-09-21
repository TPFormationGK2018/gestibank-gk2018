package com.gestibank.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CR")
@Table(name="CpteRemunere")
public class CpteRemunere extends Compte {
	
	private static final long serialVersionUID = 1L;
	private double taux;

	
	
	public CpteRemunere() {
		super();
	}

	public CpteRemunere(double taux) {
		super();
		this.taux = taux;
	}

	public CpteRemunere(String rip, Date dateCreation, double solde, Client client, Conseiller conseiller) {
		super(rip, dateCreation, solde, client, conseiller);
		// TODO Auto-generated constructor stub
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
}
