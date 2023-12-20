package java.br.domain.dao;

import java.br.domain.Produto;

public interface IProdutoDAO {
    public Integer cadastrar(Produto produto) throws Exception;
    public Produto consultar(Integer Id) throws Exception;

    public Integer excluir(Produto produtoBD) throws Exception;

    public Integer buscar(Produto produto) throws Exception;

    public Integer atualizar(Produto produto) throws Exception;
}
