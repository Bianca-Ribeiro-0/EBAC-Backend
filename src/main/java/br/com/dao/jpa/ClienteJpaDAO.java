/**
 * 
 */
package main.java.br.com.dao.jpa;

import main.java.br.com.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
