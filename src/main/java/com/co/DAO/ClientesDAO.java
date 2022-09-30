
package com.co.DAO;

import com.co.POJO.Clientes;
import org.springframework.data.repository.CrudRepository;

public interface ClientesDAO extends CrudRepository<Clientes, Integer> {
    
}
