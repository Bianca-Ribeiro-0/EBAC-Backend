/**
 * 
 */
package main.java.br.com.dao.jpa;

import main.java.br.com.dao.generic.jpa.GenericJpaDB2DAO;
import main.java.br.com.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
