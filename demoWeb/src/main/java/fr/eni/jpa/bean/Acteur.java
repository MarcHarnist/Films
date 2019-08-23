package fr.eni.jpa.bean;

import java.util.List;

public class Acteur extends Personne {

	/**
	 * 
	 */
	public Acteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param films
	 */
	public Acteur(String nom, String prenom, List<Film> films) {
		super(nom, prenom, films);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Acteur [toString()=%s, getClass()=%s, hashCode()=%s]", super.toString(), getClass(),
				hashCode());
	}

	
	
	
}
