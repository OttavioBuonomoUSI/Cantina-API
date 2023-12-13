package com.ottamen.cantina_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "tipo")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo;

    @Column(name = "tipo")
    private String tipo;

//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo")
//    private List<ViniEntity> vini;
}
