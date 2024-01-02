/**
 * 
 */
package main.java.br.com.dao.jpa;

import main.java.br.com.dao.generic.jpa.GenericJpaDAO;
import main.java.br.com.domain.jpa.ProdutoJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
