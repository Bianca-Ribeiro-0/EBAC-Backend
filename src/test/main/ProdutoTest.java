package test.main;

import org.junit.Test;

import java.br.domain.Cliente;
import java.br.domain.Produto;
import java.br.domain.dao.ClienteDAO;
import java.br.domain.dao.IClienteDAO;
import java.br.domain.dao.IProdutoDAO;
import java.br.domain.dao.ProdutoDAO;

import static org.junit.Assert.*;

public class ProdutoTest {
    @Test
    public void cadastrarTest() throws Exception {
            IProdutoDAO dao = new ProdutoDAO();
            Produto produto = new Produto();

            produto.setId(Long.valueOf("01"));
            produto.setNome("Laptop");

            Integer qtd = dao.cadastrar(produto);
            assertTrue(qtd == 1);

            Produto produtoBD = dao.consultar(produto.getId());
            assertNotNull(produtoBD);
            assertNotNull(produtoBD.getId());
            assertEquals(produto.getId(), produtoBD.getId());
            assertEquals(produto.getNome(), produtoBD.getNome());

            Integer qtdDel = dao.excluir(produtoBD);
            assertNotNull(qtdDel);

            produtoBD.setNome("Microfone");
            Integer qtdAtualizar = dao.atualizar(produtoBD);
            assertTrue(qtdAtualizar == 1);

            Produto produtoAtualizado = dao.consultar(produto.getId());
            assertNotNull(produtoAtualizado);
            assertNotNull(produtoAtualizado.getId());
            assertEquals(produto.getId(), produtoAtualizado.getId());
            assertEquals("Microfone-fifine", produtoAtualizado.getNome());

            Integer qtdExcluir = dao.excluir(produtoAtualizado);
            assertNotNull(qtdExcluir);
        }
    }

