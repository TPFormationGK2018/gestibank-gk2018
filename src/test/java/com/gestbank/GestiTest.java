package com.gestbank;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tuple.entity.EntityMetamodel.GenerationStrategyPair;

import com.gestibank.dao.*;
import com.gestibank.entities.Client;
import com.gestibank.entities.Conseiller;
import com.gestibank.entities.CpteCourant;
import com.gestibank.entities.CpteRemunere;

@SuppressWarnings("unused")
public class GestiTest {

	public static void main(String[] args) {

		
		// Client
		Client c1 = new Client("Nathan", "Dumas", "nathan.dumas@gmail.com", "123452", "0781529996", "Nathan");
		c1.setAdresse("Lens");
		c1.setNbenfants(3);
		
		Client c2 = new Client("Dylan", "Dubois", "dylan.dubois@hotmail.com", "123454", "0781629125", "Dylan");
		c2.setAdresse("Arras");
		c2.setNbenfants(0);
		
		Client c3 = new Client("Mohammed", "Mezrou", "mohammed.mezrou@hotmail.com", "123452", "0781829124", "Mohammedn");
		c3.setAdresse("Fiver");
		c3.setNbenfants(1);
		
		Client c4 = new Client("Cyril", "Mezrou", "cyril.mezrou@hotmail.com", "123455", "0781829128", "Cyril");
		c4.setAdresse("Hellemmes");
		c4.setNbenfants(1);
		
		// Conseiller
		Conseiller cs1 = new Conseiller("Dialo", "Alpha", "alpha.dialo@outlook.fr", "254619", "0612458596", "Alpha");
		cs1.setMatricule("C1120517");;
		cs1.setDateContrat(new Date());
		
		Conseiller cs2 = new Conseiller("Mai Trang", "Do", "miagrant.do@gmail.com", "254618", "0781529996", "Miado");
		cs2.setMatricule("C2020518");;
		cs2.setDateContrat(new Date());
		
		// Compte
		CpteCourant cc1 = new CpteCourant("FR78-5236-2561-2361-458", new Date(), 12000, c1, cs1);
		cc1.setMtAutorise(700);
		cc1.setTauxDecouvert(2);
		
		CpteCourant cc2 = new CpteCourant("FR50-4236-1562-5360-459", new Date(), 12000, c2, cs1);
		cc2.setMtAutorise(800);
		cc2.setTauxDecouvert(2);
		
		CpteCourant cc3 = new CpteCourant("FR68-5263-2521-6218-125", new Date(), 9000, c3, cs1);
		cc3.setMtAutorise(1000);
		cc3.setTauxDecouvert(3);
		CpteRemunere cr1 = new CpteRemunere("FR68-4263-2521-6020-005", new Date(), 9000, c4, cs2);
		cr1.setTaux(0.5);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.getTransaction().commit();
		session.close();
		
		
/*		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestibank");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
//		Ajouter clients
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
//		Ajouter conseillers
		em.persist(cs1);em.persist(cs2);
//		Ajouter comptes
		em.persist(cc1);em.persist(cc2);em.persist(cr1);
		
		
		GestDaoAdmins dao = new GestDaoAdminsIMPL();
		
		Client c5 = new Client("Cyril", "Mezrou", "cyril.mezrou@hotmail.com", "123455", "0781829128", "Cyril");
		c5.setAdresse("Centre");
		c5.setNbenfants(1);
		Client c6 = new Client("Sptephan", "Allows", "cyril.mezrou@hotmail.com", "123455", "0781829128", "Cyril");
		c6.setAdresse("Gambetta");
		c6.setNbenfants(1);

		dao.addClient(c5);

		dao.addCompte(cc1);
		
		em.getTransaction().commit();
		em.close();
		emf.close();*/


	}

}
