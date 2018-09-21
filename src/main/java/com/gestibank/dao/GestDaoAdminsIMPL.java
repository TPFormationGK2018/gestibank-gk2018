package com.gestibank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.gestibank.entities.Client;
import com.gestibank.entities.Compte;
import com.gestibank.entities.Conseiller;
import com.gestibank.entities.DeOuvCompte;
import com.gestibank.entities.Demandes;
import com.gestibank.entities.Utilisateur;

@SuppressWarnings("unused")
public class GestDaoAdminsIMPL implements GestDaoAdmins{

	@PersistenceContext
	private EntityManager em;
//	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("gestibank" );
//	private EntityManager em=emf.createEntityManager(); 
	
	@Override
	public void addClient(Client cli) {
		System.out.println(cli.getEmail());
		em.persist(cli);
		System.out.println("addClient");
	}

	@Override
	public Conseiller addConseiller(Conseiller e, String matricule) {
		em.persist(e);
		return e;
	}

	@Override
	public Compte addCompte(Compte cp) {
		em.persist(cp);
		return cp;
	}

	@Override
	public Compte consulterCompte(String codeCpte) {
		Compte cp = em.find(Compte.class,codeCpte);
		System.out.println("CodeCompte");
		return cp;
	}

	@Override
	public Conseiller consulterConseiller(String codeCons) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> listeComptes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> listeComptesParType(String typeCpte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conseiller> listeConseillers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> listeUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeOuvCompte> listeDemandes(String codeClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifConseiller(String codeCons) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifClient(String codeClient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimConseiller(String codeCons) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimClient(String codeClient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void affecterClient(String codeClient, String codeCons) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Demandes> consulterDemandes(String codeClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void demandeModifMDP(String codeClient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demandeModifADRESS(String codeClient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demandeModifTEL(String codeClient) {
		// TODO Auto-generated method stub
		
	}

}
