/**
 * 
 */
package test.java.br.com;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import main.java.br.com.dao.CursoDao;
import main.java.br.com.dao.ICursoDao;
import main.java.br.com.domain.Curso;

public class CursoTest {

	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java Backend");
		curso = cursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
