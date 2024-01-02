/**
 * 
 */
package main.java.br.com.dao.generic.jpa;

import java.io.Serializable;

import main.java.br.com.domain.jpa.Persistente;

public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
