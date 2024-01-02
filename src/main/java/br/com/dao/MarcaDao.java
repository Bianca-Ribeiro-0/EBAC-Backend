/**
 * 
 */
package main.java.br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.br.com.domain.Marca;

/**
 * @author rodrigo.pires
 *
 */
public class MarcaDao implements IMarcaDao {

	@Override
	public Marca cadastrar(Marca computador) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(computador);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		
		return computador;
	}

}
