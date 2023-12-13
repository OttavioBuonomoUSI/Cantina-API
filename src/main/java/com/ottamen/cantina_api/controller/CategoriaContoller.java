package com.ottamen.cantina_api.controller;

import com.ottamen.cantina_api.model.CategoriaEntity;
import com.ottamen.cantina_api.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CategoriaContoller {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/categorie")
    public Iterable<CategoriaEntity> getCategorie() {
        return categoriaService.findAll();
    }

    @GetMapping("/categorie/{id}")
    public Optional<CategoriaEntity> getCategoria(@PathVariable Long id) {
        return categoriaService.findById(id);
    }
}
