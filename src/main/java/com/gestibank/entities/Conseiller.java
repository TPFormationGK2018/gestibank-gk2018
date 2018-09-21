package com.gestibank.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CS")
@Table(name="Conseiller")
public class Conseiller extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String matricule;
	private Date dateContrat;
	
	@OneToMany  (mappedBy="conseiller",fetch=FetchType.LAZY)
	private Collection<Compte> compte;
	
	public Conseiller() {
		// TODO Auto-generated constructor stub
	}
	
	public Conseiller(String matricule, Date dateContrat) {
		super();
		this.matricule = matricule;
		this.dateContrat = dateContrat;
	}

	public Conseiller(String nom, String prenom, String email, String motdepass, String telephone,
			String pseudonyme) {
		super(nom, prenom, email, motdepass, telephone, pseudonyme);
		// TODO Auto-generated constructor stub
	}

	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public Date getDateContrat() {
		return dateContrat;
	}
	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}
	
}
