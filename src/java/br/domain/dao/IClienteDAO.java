package java.br.domain.dao;

import java.br.domain.Cliente;

public interface IClienteDAO {

    public Integer cadastrar(Cliente cliente) throws Exception;
    public Cliente consultar(String codigo) throws Exception;

    public Integer excluir(Cliente clienteBD) throws Exception;

    public Integer buscar(Cliente cliente) throws Exception;

    public Integer atualizar(Cliente cliente) throws Exception;
}
