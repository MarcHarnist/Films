package fr.eni.jpa.bean;

import java.sql.Date;
import java.util.Arrays;

public class Film {
	
	//Attributs de classe
	private String titre;
	private Date annee;
	private String style;
	private String realisateur;
	private String duree;
	private String vu;
	private String[] acteurs;

	//#### Constructeurs ####
	/** Constructeur vide **/
	public Film() {	
		super();
		this.acteurs = new String[4]; //Cinq acteurs possibles par film
	}
	
	/** Constructeur avec les attributs
	 * @param titre du film
	 * @param annee de sortie du film
	 * @param style du film ou catégorie
	 * @param realisateur du film
	 * @param duree du film
	 * @param vu le film a-t-il été vu?
	 * @param acteurs du film
	 */
	public Film(String titre, Date annee, String style, String realisateur, String duree, String vu, String[] acteurs) {
		setTitre(titre);
		setAnnee(annee);
		setStyle(style);
		setRealisateur(realisateur);
		setDuree(duree);
		setVu(vu);
		this.acteurs = new String[4]; //Cinq acteurs possibles par film
	}

	/** Méthode pour ajouter un acteur au tableau "acteurs" de l'objet film
	 * @param acteur ajouté au tableau
	 * @return message: un message de réussite ou d'échec est retourné
	 */
	public String ajouterActeur(String acteur) {
		String message = " aucun acteur ajouté dans Film vers la ligne 48";
		for(int i = 0; i < this.acteurs.length; i++){
			if(acteurs[i] != null) {
				acteurs[i] = acteur;
				message = " L'acteur " + acteur + " a été ajouté à l'objet Film avec succès.";
			}
		}
		return message;
	}
	
	
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the annee
	 */
	public Date getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(Date annee) {
		this.annee = annee;
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	/**
	 * @return the realisateur
	 */
	public String getRealisateur() {
		return realisateur;
	}

	/**
	 * @param realisateur the realisateur to set
	 */
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	/**
	 * @return the duree
	 */
	public String getDuree() {
		return duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(String duree) {
		this.duree = duree;
	}

	/**
	 * @return the vu
	 */
	public String getVu() {
		return vu;
	}

	/**
	 * @param vu the vu to set
	 */
	public void setVu(String vu) {
		this.vu = vu;
	}

	/**
	 * @return the acteurs
	 */
	public String[] getActeurs() {
		return acteurs;
	}

	/**
	 * @param acteurs the acteurs to set
	 */
	public void setActeurs(String[] acteurs) {
		this.acteurs = acteurs;
	}

	/** Méthode toString() personnalisée
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Film [titre=%s, annee=%s, style=%s, realisateur=%s, duree=%s, vu=%s, acteurs=%s]", titre,
				annee, style, realisateur, duree, vu, Arrays.toString(acteurs));
	}
	
	

}
