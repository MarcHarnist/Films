package fr.eni.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import fr.eni.jpa.bean.Film;

public class GenericDaoImpl {
	
	public static void add(Film film) throws DAOException{
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(film);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'ajout du film " 
			+ film + " : " + e.getMessage());
		}
	}

}
