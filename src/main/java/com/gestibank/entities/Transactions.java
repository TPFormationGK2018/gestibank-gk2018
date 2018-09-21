package com.gestibank.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="TRANS_TYPE")
@Table(name="TRANSACTIONS")
public class Transactions implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	private double montant;
	private Date dateTransaction;
	@ManyToOne
	@JoinColumn(name="CODE_CPTE")
	private Compte compte;
	
	public Transactions() {
		super();
	}

	public Transactions(double montant, Date dateTransaction) {
		super();
		this.montant = montant;
		this.dateTransaction = dateTransaction;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

}
