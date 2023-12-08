/**
 *
 */
package br.com.ribeiro.domain.dao;

import br.com.ribeiro.domain.generic.IGenericDAO;
import br.com.ribeiro.domain.dao.VendaDAO;
import br.com.ribeiro.domain.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<VendaDao, String> {

    public void finalizarVenda(VendaDao venda) throws TipoChaveNaoEncontradaException;
}