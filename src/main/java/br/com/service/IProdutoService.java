/**
 * 
 */
package main.java.br.com.service;

import java.util.List;

import main.java.br.com.domain.Produto;
import main.java.br.com.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
