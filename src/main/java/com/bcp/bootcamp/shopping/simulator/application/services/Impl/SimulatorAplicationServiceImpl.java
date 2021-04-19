package com.bcp.bootcamp.shopping.simulator.application.services.Impl;

import com.bcp.bootcamp.shopping.simulator.application.services.SimulatorApplicationService;
import com.bcp.bootcamp.shopping.simulator.persistence.entities.ESimulator;
import com.bcp.bootcamp.shopping.simulator.persistence.repositories.SimulatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SimulatorAplicationServiceImpl implements SimulatorApplicationService {
    @Autowired
    private SimulatorRepository simDaoRepository;
    public List<ESimulator> getSimulator(){
        return (List<ESimulator>) simDaoRepository.findAll();
    }

}
