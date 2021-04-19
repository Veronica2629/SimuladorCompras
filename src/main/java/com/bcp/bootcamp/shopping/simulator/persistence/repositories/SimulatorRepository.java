package com.bcp.bootcamp.shopping.simulator.persistence.repositories;

import com.bcp.bootcamp.shopping.simulator.persistence.entities.ESimulator;
import org.springframework.data.repository.CrudRepository;

public interface SimulatorRepository extends CrudRepository<ESimulator, Integer>{
}
