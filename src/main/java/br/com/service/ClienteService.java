/**
 * 
 */
package main.java.br.com.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import main.java.br.com.dao.IClienteDAO;
import main.java.br.com.domain.Cliente;
import main.java.br.com.exceptions.DAOException;
import main.java.br.com.exceptions.MaisDeUmRegistroException;
import main.java.br.com.exceptions.TableException;
import main.java.br.com.services.generic.GenericService;

@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
