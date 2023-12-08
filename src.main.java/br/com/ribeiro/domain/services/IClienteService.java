package br.com.ribeiro.domain.services;

import br.com.ribeiro.domain.Cliente;

public interface IClienteService{
    void salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);
}
