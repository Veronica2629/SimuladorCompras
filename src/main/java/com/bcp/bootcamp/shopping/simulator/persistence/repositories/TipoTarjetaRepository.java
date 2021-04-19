package com.bcp.bootcamp.shopping.simulator.persistence.repositories;
import com.bcp.bootcamp.shopping.simulator.persistence.entities.ETipoTarjeta;
import org.springframework.data.repository.CrudRepository;

public interface TipoTarjetaRepository extends CrudRepository <ETipoTarjeta, Integer> {
}
