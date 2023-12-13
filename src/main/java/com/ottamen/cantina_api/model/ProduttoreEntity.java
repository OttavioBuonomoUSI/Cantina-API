package com.ottamen.cantina_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "produttore", schema = "Cantina", catalog = "")
public class ProduttoreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_produttore", nullable = false)
    private int idProduttore;

    @Column(name = "nome_produttore", nullable = true, length = 500)
    private String nomeProduttore;

}
