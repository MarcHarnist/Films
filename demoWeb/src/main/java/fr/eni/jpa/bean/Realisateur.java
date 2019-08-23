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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Realisateur [toString()=%s, getClass()=%s, hashCode()=%s]", super.toString(), getClass(),
				hashCode());
	}
	
	

}
