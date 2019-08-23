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
	private int annee;
	private String style;
	private String realisateur;
	private int heure;
	private int minutes;
	private String vu;
	private String[] acteurs;
	private String synopsis;
	
	//Trois string provisoires pour tester le formulaire ajouterFilm
	private String annee2;
	private String heure2;
	private String minutes2;
	private String acteur1;

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
	public Film(String titre, int annee, String style, String realisateur, String duree, String vu, String[] acteurs, String synopsis) {
		setTitre(titre);
		setAnnee(annee);
		setStyle(style);
		setRealisateur(realisateur);
		setHeure(heure);
		setMinutes(minutes);
		setVu(vu);
		setSynopsis(synopsis);
		this.acteurs = new String[4]; //Cinq acteurs possibles par film
	}

	public Film(String titre2, String annee2, String style2, String realisateur2, String heure2, String minutes2,
			String vu2, String synopsis2, String acteur1) {
		setTitre(titre2);
		setAnnee2(annee2);
		setStyle(style2);
		setRealisateur(realisateur2);
		setHeure2(heure2);
		setMinutes2(minutes2);
		setVu(vu2);
		setSynopsis(synopsis2);
		this.acteurs = new String[4]; //Cinq acteurs possibles par film	
	
	
	}

	private void setMinutes2(String minutes2) {
		// TODO Auto-generated method stub
		
	}

	private void setHeure2(String heure2) {
		// TODO Auto-generated method stub
		
	}

	private void setAnnee2(String annee2) {
		// TODO Auto-generated method stub
		
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
	public int getAnnee() {
		return annee;
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
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

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}


	/**
	 * @return the annee2
	 */
	public String getAnnee2() {
		return annee2;
	}

	/**
	 * @return the heure2
	 */
	public String getHeure2() {
		return heure2;
	}

	/**
	 * @return the minutes2
	 */
	public String getMinutes2() {
		return minutes2;
	}
	
	
	/**
	 * @return the heure
	 */
	public int getHeure() {
		return heure;
	}

	/**
	 * @param heure the heure to set
	 */
	public void setHeure(int heure) {
		this.heure = heure;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	
	public String getActeur1() {
		return acteur1;
	}

	public void setActeur1(String acteur1) {
		this.acteur1 = acteur1;
	}

	/** Méthode toString() personnalisée
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Film [titre=%s, annee=%s, style=%s, realisateur=%s, durée: %s:%s, vu=%s, acteurs=%s, synopsis=%s]",
				titre, annee, style, realisateur, heure, minutes, vu, Arrays.toString(acteurs), synopsis);
	}
}
