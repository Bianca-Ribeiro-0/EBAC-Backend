/**
 * 
 */
package main.java.br.com.dao.jpa;

import main.java.br.com.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
