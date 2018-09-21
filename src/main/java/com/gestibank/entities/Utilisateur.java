package com.gestibank.entities;

import java.io.Serializable;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="USER_TYPE")
@Table(name="UTILISATEUR")
public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	
	@Id @GeneratedValue
	private int id;
	private static final long serialVersionUID = 1L;
	
	private String nom;
	private String prenom;
	private String email;
	private String motdepass;
	private String telephone;
	private String pseudonyme;
//	@OneToOne
//	@JoinColumn(name="CODE_CLI")
//	private Client client;

	
	public Utilisateur() {
		super();
	}


	public Utilisateur(String nom, String prenom, String email, String motdepass, String telephone,
			String pseudonyme) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motdepass = motdepass;
		this.telephone = telephone;
		this.pseudonyme = pseudonyme;
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMotdepass() {
		return motdepass;
	}


	public void setMotdepass(String motdepass) {
		this.motdepass = motdepass;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getPseudonyme() {
		return pseudonyme;
	}


	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

}
