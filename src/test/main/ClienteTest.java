package test.main;

import org.junit.Test;

import java.br.domain.Cliente;
import java.br.domain.dao.ClienteDAO;
import java.br.domain.dao.IClienteDAO;

import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente();

        cliente.setCodigo("01");
        cliente.setNome("Bia");


        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);

        clienteBD.setNome("leo");
        Integer qtdAtualizar = dao.atualizar(clienteBD);
        assertTrue(qtdAtualizar == 1);


        Cliente clienteAtualizado = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteAtualizado);
        assertNotNull(clienteAtualizado.getId());
        assertEquals(cliente.getCodigo(), clienteAtualizado.getCodigo());
        assertEquals("NovoNome", clienteAtualizado.getNome());


        Integer qtdExcluir = dao.excluir(clienteAtualizado);
        assertNotNull(qtdExcluir);

    }

}