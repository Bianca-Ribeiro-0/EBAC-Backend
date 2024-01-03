/**
 * 
 */
package main.java.br.com.service;

import java.util.List;

import main.java.br.com.domain.Cliente;
import main.java.br.com.exceptions.DAOException;
import main.java.br.com.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
