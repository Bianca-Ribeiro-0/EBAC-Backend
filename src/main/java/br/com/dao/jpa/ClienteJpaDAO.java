/**
 * 
 */
package main.java.br.com.dao.jpa;

import main.java.br.com.dao.generic.jpa.GenericJpaDAO;
import main.java.br.com.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
