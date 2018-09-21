package com.gestibank.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("ADMIN")
@Table(name="Administrateur")
public class Administrateur extends Utilisateur implements Serializable {

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(String nom, String prenom, String email, String motdepass, String telephone,
			String pseudonyme) {
		super(nom, prenom, email, motdepass, telephone, pseudonyme);
		// TODO Auto-generated constructor stub
	}
	
}
