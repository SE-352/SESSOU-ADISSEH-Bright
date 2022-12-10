package com.ipnetuniversity.tp3.entities;

import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Joueur")
public class Joueur implements Comparable<Joueur> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 60, nullable = false, updatable = true)
	private String nom;

	@Column(length = 60, nullable = false, updatable = true)
	private String prenom;

	@Column(length = 60, nullable = false, updatable = true)
	private String numeroLicence;

	@Column(length = 60, nullable = false, updatable = true)
	private int nombrePoint = 0;

	public Joueur(String nom, String prenom, String numeroLicence, int nombrePoint) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroLicence = numeroLicence;
		this.nombrePoint = nombrePoint;
	}

	public int compareTo(Joueur o) {
		Joueur joueur = (Joueur) o;
		if (this.nombrePoint <= joueur.getNombrePoint()) {
			return -1;
		} else if (this.nombrePoint >= joueur.getNombrePoint()) {
			return 1;
		}
		return 0;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joueur other = (Joueur) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (numeroLicence == null) {
			if (other.numeroLicence != null)
				return false;
		} else if (!numeroLicence.equals(other.numeroLicence))
			return false;
		if (nombrePoint != other.nombrePoint)
			return false;
		return true;
	}
}
