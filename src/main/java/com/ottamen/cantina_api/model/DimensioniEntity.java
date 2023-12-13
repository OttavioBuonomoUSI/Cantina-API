package com.ottamen.cantina_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "dimensioni", schema = "Cantina", catalog = "")
public class DimensioniEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_dimensione", nullable = false)
    private int idDimensione;

    @Column(name = "size", nullable = true, length = 10)
    private String size;
}
