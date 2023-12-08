package br.com.ribeiro.domain.services;

import br.com.ribeiro.domain.Cliente;
import br.com.ribeiro.domain.dao.ClienteDao;
import br.com.ribeiro.domain.dao.IClienteDao;

//camada de serviço = validação de regras de negócio
public class ClienteService implements IClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }
    @Override
    public void salvar(Cliente cliente) {
        clienteDao.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDao.buscaPorCPF(cpf);
    }
}
