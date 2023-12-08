package br.com.ribeiro.tests.mock;

import br.com.ribeiro.domain.Cliente;
import br.com.ribeiro.domain.dao.IClienteDao;

public class ClienteDaoMock implements IClienteDao {
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscaPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
