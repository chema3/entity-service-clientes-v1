package net.emma.val.service;

import java.util.List;

import net.emma.val.model.Cliente;

public interface ClienteService {
	
	List<Cliente> obtenerTodos();
	Cliente crear(Cliente cliente);
	Cliente actualizar(Cliente cliente, Integer id);
	Integer eliminar(int id);

}
 