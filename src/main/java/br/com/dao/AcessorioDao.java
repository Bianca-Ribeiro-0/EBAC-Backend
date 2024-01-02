/**
 * 
 */
package main.java.br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.br.com.domain.Acessorio;

/**
 * @author rodrigo.pires
 *
 */
public class AcessorioDao implements ICarroDao {

	@Override
	public Acessorio cadastrar(Acessorio curso) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(curso);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		
		return curso;
	}

}
