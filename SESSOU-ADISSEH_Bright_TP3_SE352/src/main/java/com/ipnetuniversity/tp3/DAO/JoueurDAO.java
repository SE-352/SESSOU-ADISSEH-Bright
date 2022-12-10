package com.ipnetuniversity.tp3.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ipnetuniversity.tp3.entities.Joueur;

public class JoueurDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TournoiPU");
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();

	public Joueur add(Joueur joueur) {
		tx.begin();
		em.persist(joueur);
		tx.commit();
		return joueur;
	}

	public List<Joueur> listJoueur() {
		Query query = em.createQuery("SELECT j FROM Joueur j");
		return query.getResultList();

	}

	public Joueur update(Joueur joueur) {
		Joueur joueurToUpdate = em.find(Joueur.class, joueur.getId());
		tx.begin();
		joueur.setNom(joueur.getNom());
		joueur.setPrenom(joueur.getPrenom());
		joueur.setNumeroLicence(joueur.getNumeroLicence());
		joueur.setNombrePoint(joueur.getNombrePoint());
		return joueurToUpdate;
	}

	public Joueur findById(int id) {
		return em.find(Joueur.class, id);
	}

	public void deleteById(int id) {
		tx.begin();
		Query query = em.createQuery("Delete from Joueur where id =" + id);
		query.executeUpdate();
		tx.commit();
	}

	public void close() {
		this.em.close();
		this.emf.close();
	}
}
