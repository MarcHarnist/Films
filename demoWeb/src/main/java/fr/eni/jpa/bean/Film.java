package fr.eni.jpa.bean;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Film")
public class Film {
	
	@Id
	//Attributs de classe
	private String titre;
	private String annee;
	private String style;
	private String realisateur;
	private String heure;
	private String minutes;
	private String vu;
	private String acteur1;
	private String synopsis;
	
	//#### Constructeurs ####
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param titre
	 * @param annee
	 * @param style
	 * @param realisateur
	 * @param heure
	 * @param minutes
	 * @param vu
	 * @param acteur1
	 * @param synopsis
	 */
	public Film(String titre, String annee, String style, String realisateur, String heure, String minutes, String vu,
			String acteur1, String synopsis) {
		this.titre = titre;
		this.annee = annee;
		this.style = style;
		this.realisateur = realisateur;
		this.heure = heure;
		this.minutes = minutes;
		this.vu = vu;
		this.acteur1 = acteur1;
		this.synopsis = synopsis;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Film [titre=%s, annee=%s, style=%s, realisateur=%s, heure=%s, minutes=%s, vu=%s, acteur1=%s, synopsis=%s]",
				titre, annee, style, realisateur, heure, minutes, vu, acteur1, synopsis);
	}

	/** Méthode toString() personnalisée
	 * @see java.lang.Object#toString()
	 */


}
