package com.ottamen.cantina_api.controller;

import com.ottamen.cantina_api.model.DimensioniEntity;
import com.ottamen.cantina_api.service.DimensioniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DimensioniController {

    @Autowired
    private DimensioniService dimensioniService;

    @GetMapping("/dimensioni")
    public Iterable<DimensioniEntity> getDimensioni() {
        return dimensioniService.getDimensioni();
    }

    @GetMapping("/dimensioni/{id}")
    public DimensioniEntity getDimensioneById(@PathVariable Long id) {
        return dimensioniService.getDimensioneById(id).get();
    }
}
