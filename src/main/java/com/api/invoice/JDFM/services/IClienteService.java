package com.api.invoice.JDFM.services;

import java.util.List;
import com.api.invoice.JDFM.models.entities.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);

	public void delete(Cliente cliente);


}