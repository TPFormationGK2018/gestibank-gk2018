package com.gestibank.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-09-21T18:18:16.205+0200")
@StaticMetamodel(CpteCourant.class)
public class CpteCourant_ extends Compte_ {
	public static volatile SingularAttribute<CpteCourant, Double> mtAutorise;
	public static volatile SingularAttribute<CpteCourant, Double> tauxDecouvert;
}
