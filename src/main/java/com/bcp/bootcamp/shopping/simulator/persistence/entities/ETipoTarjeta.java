package com.bcp.bootcamp.shopping.simulator.persistence.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tipotarjeta")
public class ETipoTarjeta {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String type;


}
