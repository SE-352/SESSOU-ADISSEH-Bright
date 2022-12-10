package com.ipnetuniversity.tp3;

import com.ipnetuniversity.tp3.DAO.JoueurDAO;
import com.ipnetuniversity.tp3.entities.Joueur;

public class Main {

	public static void main(String[] args) {

		JoueurDAO joueurDAO = new JoueurDAO();

		Joueur joueur1 = new Joueur("ABALO", "jean", "NUM001", 0);
		Joueur joueur2 = new Joueur("KOKOU", "bernard", "NUM002", 0);
		Joueur joueur3 = new Joueur("KODJOVI", "wisdom", "NUM003", 0);
		Joueur joueur4 = new Joueur("AMAH", "rose", "NUM004", 0);
//
//		// add joueur
//		joueurDAO.add(joueur1);
//		joueurDAO.add(joueur2);
//		joueurDAO.add(joueur3);
//		joueurDAO.add(joueur4);

		// list joueur
		joueurDAO.listJoueur();

		// find joueur
		joueurDAO.findById(1);
		joueurDAO.findById(3);

		// delete joueur
		joueurDAO.deleteById(2);

		// update joueur
		joueur1.setNom("SESSOU");
		joueur1.setPrenom("Bright");
		joueur1.setNumeroLicence("NUMBRI001");
		joueur1.setNombrePoint(100);
		joueurDAO.update(joueur1);

		// list joueur
		joueurDAO.listJoueur();

	}

}
