package com.gestibank.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("CRE")
@Table(name="CREDIT")
public class Credit extends Transactions {
	
	@OneToOne
	private Virement virement;

	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credit(double montant, Date dateTransaction) {
		super(montant, dateTransaction);
		// TODO Auto-generated constructor stub
	}

	

}
