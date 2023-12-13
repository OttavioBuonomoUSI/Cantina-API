package com.ottamen.cantina_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "vini", schema = "Cantina", catalog = "")
public class ViniEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_vino", nullable = false)
    private int idVino;
    
    @Column(name = "nome", nullable = true, length = 40)
    private String nome;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = false)
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo")
    private Tipo tipo;

    
    @Column(name = "annata", nullable = true, length = 10)
    private String annata;
    
    @Column(name = "quantita", nullable = true)
    private Integer quantita;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_dimensione", referencedColumnName = "id_dimensione")
    private DimensioniEntity dimensione;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = false)
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    private CategoriaEntity categoria;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = false)
    @JoinColumn(name = "id_luogo", referencedColumnName = "id_luogo")
    private Luogo luogo;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = false)
    @JoinColumn(name = "id_produttore", referencedColumnName = "id_produttore")
    private ProduttoreEntity produttore;
    
    @Column(name = "comment", nullable = true, length = 1000)
    private String comment;
    
    @Column(name = "finito", nullable = true)
    private Integer finito;
}
