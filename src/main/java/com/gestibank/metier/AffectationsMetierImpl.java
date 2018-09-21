package com.gestibank.metier;

import java.util.List;

import com.gestibank.entities.Client;
import com.gestibank.entities.Compte;
import com.gestibank.entities.Conseiller;
import com.gestibank.entities.DeOuvCompte;
import com.gestibank.entities.Demandes;
import com.gestibank.entities.Utilisateur;

public abstract class AffectationsMetierImpl implements AffectationsMetier {

	@Override
	public Compte consulterCompte(String codeCpte) {
		// TODO Auto-generated method stub
		return null;
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
