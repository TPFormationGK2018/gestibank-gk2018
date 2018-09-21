package com.gestibank.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("VIR")
@Table(name="VIREMENT")
public class Virement {
	@Id @GeneratedValue
	private int id;
	private Date dateVirement;
	private double montant;
	@OneToOne
	private Debit debit;
	@OneToOne
	private Credit credit;
	public Virement() {
		super();
	}
	public Virement(int id, Date dateVirement, double montant, Debit debit, Credit credit) {
		super();
		this.id = id;
		this.dateVirement = dateVirement;
		this.montant = montant;
		this.debit = debit;
		this.credit = credit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateVirement() {
		return dateVirement;
	}
	public void setDateVirement(Date dateVirement) {
		this.dateVirement = dateVirement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Debit getDebit() {
		return debit;
	}
	public void setDebit(Debit debit) {
		this.debit = debit;
	}
	public Credit getCredit() {
		return credit;
	}
	public void setCredit(Credit credit) {
		this.credit = credit;
	}
	
}
