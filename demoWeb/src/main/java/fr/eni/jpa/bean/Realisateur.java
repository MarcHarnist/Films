package fr.eni.jpa.bean;

import java.util.List;

public class Realisateur extends Personne {

	/**
	 * 
	 */
	public Realisateur() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param films
	 */
	public Realisateur(String nom, String prenom, List<Film> films) {
		super(nom, prenom, films);
	}
	
	

}
