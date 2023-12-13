package com.ottamen.cantina_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "categoria", schema = "Cantina", catalog = "")
public class CategoriaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_categoria", nullable = false)
    private int idCategoria;

    @Column(name = "nome_categoria", nullable = false, length = 100)
    private String nomeCategoria;

}
