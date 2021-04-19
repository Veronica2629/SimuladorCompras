package com.bcp.bootcamp.shopping.simulator.application.services.Impl;

import com.bcp.bootcamp.shopping.simulator.application.services.ITipoTarjeta;
import com.bcp.bootcamp.shopping.simulator.persistence.entities.ETipoTarjeta;
import com.bcp.bootcamp.shopping.simulator.persistence.repositories.TipoTarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoTarjetaServiceImpl implements ITipoTarjeta {

    @Autowired
    private TipoTarjetaRepository tipoTarjetaRepository;

    @Override
    public List<ETipoTarjeta> listaTipoTarjeta() {
        return (List<ETipoTarjeta>) tipoTarjetaRepository.findAll();
    }
}
