package com.gestibank.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-09-21T18:18:16.215+0200")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ {
	public static volatile SingularAttribute<Utilisateur, Integer> id;
	public static volatile SingularAttribute<Utilisateur, String> nom;
	public static volatile SingularAttribute<Utilisateur, String> prenom;
	public static volatile SingularAttribute<Utilisateur, String> email;
	public static volatile SingularAttribute<Utilisateur, String> motdepass;
	public static volatile SingularAttribute<Utilisateur, String> telephone;
	public static volatile SingularAttribute<Utilisateur, String> pseudonyme;
}
