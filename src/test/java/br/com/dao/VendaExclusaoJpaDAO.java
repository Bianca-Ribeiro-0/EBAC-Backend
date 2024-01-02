/**
 * 
 */
package test.java.br.com.dao;

import main.java.br.com.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.dao.jpa.IVendaJpaDAO;
import main.java.br.com.domain.jpa.VendaJpa;
import main.java.br.com.exceptions.DAOException;
import main.java.br.com.exceptions.TipoChaveNaoEncontradaException;

/**
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
