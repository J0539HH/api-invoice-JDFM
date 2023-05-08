package com.api.invoice.JDFM.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.api.invoice.JDFM.models.entities.Cliente; 

public interface IClienteDao extends CrudRepository<Cliente,Long> {

}