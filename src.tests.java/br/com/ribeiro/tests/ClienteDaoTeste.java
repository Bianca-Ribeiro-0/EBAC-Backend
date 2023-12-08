package br.com.ribeiro.tests;

import br.com.ribeiro.domain.dao.ClienteDao;
import br.com.ribeiro.domain.dao.IClienteDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.ribeiro.domain.Cliente;

public class ClienteDaoTeste {
    private IClienteDao clienteDao;
    private Cliente cliente;

    public ClienteDaoTeste() {
        clienteDao = new ClienteDao();
    }

    @Before
    public void init() {
        cliente = new Cliente();

        cliente.setCpf(49578987325L);
        cliente.setNome("Bia");
        cliente.setCidade("SP");
        cliente.setTel(94949278540L);
        cliente.setNumero(10);
        cliente.setEstado("SP");
        cliente.setEnd("rua etc");
        clienteDao.salvar(cliente);
    }
    @Test

}   public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.buscaPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

}
