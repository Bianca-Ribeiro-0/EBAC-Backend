/**
 * 
 */
package test.java.br.com;

import static org.junit.Assert.assertNotNull;

import main.java.br.com.domain.Carro;
import org.junit.Test;

import main.java.br.com.dao.AcessorioDao;
import main.java.br.com.dao.ICarroDao;
import main.java.br.com.domain.Acessorio;

public class CarroTest {

	private ICarroDao carroDao;
	
	public CarroTest() {
		carroDao = new AcessorioDao();
	}

	@Test
	public void cadastrar() {
		Acessorio ac = new Acessorio();
		ac.setCodigo("A1");
		ac.setDescricao("acessorio teste");
		ac.setNome("acessorio x");
		ac = carroDao.cadastrar(ac);
		
		assertNotNull(ac);
		assertNotNull(ac.getId());
	}
}
