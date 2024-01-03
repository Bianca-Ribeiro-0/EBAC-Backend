/**
 * 
 */
package main.java.br.com.dao;

import java.util.List;

import main.java.br.com.dao.generic.IGenericDAO;
import main.java.br.com.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
