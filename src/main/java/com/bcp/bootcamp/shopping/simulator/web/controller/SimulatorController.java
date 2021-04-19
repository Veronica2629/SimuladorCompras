package com.bcp.bootcamp.shopping.simulator.web.controller;

import com.bcp.bootcamp.shopping.simulator.application.services.ITipoTarjeta;
import com.bcp.bootcamp.shopping.simulator.application.services.SimulatorApplicationService;
import com.bcp.bootcamp.shopping.simulator.persistence.entities.ESimulator;
import com.bcp.bootcamp.shopping.simulator.persistence.entities.ETipoTarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SimulatorController {
    @Autowired
    private SimulatorApplicationService simappService;

    @Autowired
    private ITipoTarjeta iTipoTarjeta;

    @GetMapping({"/form"})
    String getform(Model model){
         model.addAttribute("titulo", "Formulario del Simulador" );
         model.addAttribute("Formulario del Simulador", "titulo");
//       List<ETipoTarjeta> tipoTarjetaList = ITipoTarjeta.listaTipoTarjeta();

       return "form";
    }


}
