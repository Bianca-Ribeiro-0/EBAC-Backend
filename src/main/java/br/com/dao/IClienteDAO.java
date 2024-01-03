/**
 * 
 */
package main.java.br.com.dao;

import java.util.List;

import main.java.br.com.dao.generic.IGenericDAO;
import main.java.br.com.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
