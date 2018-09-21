package com.gestibank.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-09-21T19:35:50.272+0200")
@StaticMetamodel(Compte.class)
public class Compte_ {
	public static volatile SingularAttribute<Compte, String> rib;
	public static volatile SingularAttribute<Compte, Date> dateCreation;
	public static volatile SingularAttribute<Compte, Double> solde;
	public static volatile SingularAttribute<Compte, Client> client;
	public static volatile SingularAttribute<Compte, Conseiller> conseiller;
	public static volatile CollectionAttribute<Compte, Transactions> transaction;
}
