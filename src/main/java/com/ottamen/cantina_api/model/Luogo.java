package com.ottamen.cantina_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "luogo")
public class Luogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_luogo;

    @Column(name = "nome")
    private String nome;
}
