package com.gestibank.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("DEB")
@Table(name="DEBIT")
public class Debit extends Transactions{
	
	@OneToOne
	private Virement virement;

	public Debit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Debit(double montant, Date dateTransaction) {
		super(montant, dateTransaction);
		// TODO Auto-generated constructor stub
	}
	

}
