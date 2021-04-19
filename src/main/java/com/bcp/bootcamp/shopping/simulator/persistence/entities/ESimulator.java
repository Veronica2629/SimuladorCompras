package com.bcp.bootcamp.shopping.simulator.persistence.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "simulator")
    public class ESimulator {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Integer dni;
        private String cardType;
        private String cardNumber;
        private Double amount;
        private Integer parts;
        private Double rate;
        private LocalDate buydate;
        private LocalDate payday;


    }

