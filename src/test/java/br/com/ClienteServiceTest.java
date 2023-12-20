/**
 * 
 */
package test.java.br.com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import test.java.br.com.dao.ClienteDaoMock;
import main.java.br.com.dao.IClienteDAO;
import main.java.br.com.domain.Cliente;
import main.java.br.com.exceptions.DAOException;
import main.java.br.com.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.services.ClienteService;
import main.java.br.com.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new IClienteDAO();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setNomeMae("Maria");
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Bia");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Bia", cliente.getNome());
	}
}
