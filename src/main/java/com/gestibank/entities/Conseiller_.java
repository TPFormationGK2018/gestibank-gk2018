package com.gestibank.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-09-21T19:36:16.161+0200")
@StaticMetamodel(Conseiller.class)
public class Conseiller_ extends Utilisateur_ {
	public static volatile SingularAttribute<Conseiller, String> matricule;
	public static volatile SingularAttribute<Conseiller, Date> dateContrat;
	public static volatile CollectionAttribute<Conseiller, Compte> compte;
}
