package fr.eni.jpa.bean;

import java.util.List;

public class Personne {
	
	//Attribut
	private String nom;
	private String prenom;
	private List<Film> films;
	
	/** Constructeur vide
	 * 
	 */
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param films
	 */
	public Personne(String nom, String prenom, List<Film> films) {
		this.nom = nom;
		this.prenom = prenom;
		this.films = films;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Personne [nom=%s, prenom=%s, films=%s]", nom, prenom, films);
	}

	
	
	 
}
