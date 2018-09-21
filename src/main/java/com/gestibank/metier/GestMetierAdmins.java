package com.gestibank.metier;

import java.util.List;

import com.gestibank.entities.Client;
import com.gestibank.entities.Compte;
import com.gestibank.entities.Conseiller;
import com.gestibank.entities.DeOuvCompte;
import com.gestibank.entities.Demandes;
import com.gestibank.entities.Utilisateur;

public abstract interface GestMetierAdmins {
	public void addClient(Client cli);
	public Conseiller addConseiller(Conseiller e,String matricule);
	public Compte addCompte(Compte cpte);
	
	public Compte consulterCompte(String codeCpte);
	public Conseiller consulterConseiller(String codeCons);
	public List<Compte> listeComptes();
	public List<Compte> listeComptesParType(String typeCpte);
	public List<Client> listeClients();
	public List<Conseiller> listeConseillers();
	public List<Utilisateur> listeUsers();
	public List<DeOuvCompte> listeDemandes(String codeClient);
	
	public void modifConseiller(String codeCons);
	public void modifClient(String codeClient);
	
	public void supprimConseiller(String codeCons);
	public void supprimClient(String codeClient);
	
	public void affecterClient(String codeClient, String codeCons);
	
	public List<Demandes> consulterDemandes(String codeClient);
	public void demandeModifMDP(String codeClient);
	public void demandeModifADRESS(String codeClient);
	public void demandeModifTEL(String codeClient);
}
