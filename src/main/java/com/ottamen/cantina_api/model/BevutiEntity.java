package com.ottamen.cantina_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "bevuti", schema = "Cantina", catalog = "")
public class BevutiEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_bevuti", nullable = false)
    private int idBevuti;

    @Column(name = "nome", nullable = true, length = 100)
    private String nome;

    @Column(name = "id_tipo", nullable = true)
    private Integer idTipo;

    @Column(name = "annata", nullable = true)
    private Integer annata;

    @Column(name = "quantita", nullable = true)
    private Integer quantita;

    @Column(name = "id_dimensione", nullable = true)
    private Integer idDimensione;

    @Column(name = "id_categoria", nullable = true)
    private Integer idCategoria;

    @Column(name = "id_luogo", nullable = true)
    private Integer idLuogo;

    @Column(name = "id_produttore", nullable = true)
    private Integer idProduttore;

    @Column(name = "comment", nullable = true, length = 100)
    private String comment;

    @Column(name = "id_vino", nullable = true)
    private Integer idVino;
}
