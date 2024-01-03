/**
 * 
 */
package main.java.br.com.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import main.java.br.com.dao.IProdutoDAO;
import main.java.br.com.domain.Produto;
import main.java.br.com.services.generic.GenericService;

@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
