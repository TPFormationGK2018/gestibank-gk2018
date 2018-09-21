package com.gestibank.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-09-21T18:18:16.198+0200")
@StaticMetamodel(Client.class)
public class Client_ extends Utilisateur_ {
	public static volatile SingularAttribute<Client, String> adresse;
	public static volatile SingularAttribute<Client, Integer> nbenfants;
	public static volatile CollectionAttribute<Client, Compte> compte;
}
