package com.gestibank.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-09-21T18:18:16.213+0200")
@StaticMetamodel(Transactions.class)
public class Transactions_ {
	public static volatile SingularAttribute<Transactions, Integer> id;
	public static volatile SingularAttribute<Transactions, Double> montant;
	public static volatile SingularAttribute<Transactions, Date> dateTransaction;
	public static volatile SingularAttribute<Transactions, Compte> compte;
}
