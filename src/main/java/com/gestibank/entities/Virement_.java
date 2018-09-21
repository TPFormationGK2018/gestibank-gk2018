package com.gestibank.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-09-21T18:18:16.218+0200")
@StaticMetamodel(Virement.class)
public class Virement_ {
	public static volatile SingularAttribute<Virement, Integer> id;
	public static volatile SingularAttribute<Virement, Date> dateVirement;
	public static volatile SingularAttribute<Virement, Double> montant;
	public static volatile SingularAttribute<Virement, Debit> debit;
	public static volatile SingularAttribute<Virement, Credit> credit;
}
