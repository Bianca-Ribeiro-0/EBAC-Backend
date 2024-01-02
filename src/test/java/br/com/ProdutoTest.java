/**
 * 
 */
package test.java.br.com;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.java.br.com.dao.ProdutoDao;
import main.java.br.com.dao.IProdutoDao;
import main.java.br.com.domain.Produto;

public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("teste teste");
		produto.setNome("Curso de SQL Server");
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
}
