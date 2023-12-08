package br.com.ribeiro.tests;

import br.com.ribeiro.domain.Cliente;
import br.com.ribeiro.domain.dao.IClienteDao;
import br.com.ribeiro.domain.services.IClienteService;
import br.com.ribeiro.domain.services.ClienteService;
import br.com.ribeiro.tests.mock.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTeste {

    private IClienteService clienteService;
    private Cliente cliente;
    public ClienteServiceTeste() {
        IClienteDao dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }


    @Before
    public void init() {
        Cliente cliente = new Cliente();

        cliente.setCpf(49578987325L);
        cliente.setNome("Bia");
        cliente.setCidade("SP");
        cliente.setTel(94949278540L);
        cliente.setNumero(10);
        cliente.setEstado("SP");
        cliente.setEnd("rua etc");
        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
         Assert.assertNotNull(clienteConsultado);
    }
    public void salvarCliente() {
        clienteService.salvar(cliente);
    }

}
