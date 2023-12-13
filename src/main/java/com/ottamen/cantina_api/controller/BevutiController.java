package com.ottamen.cantina_api.controller;

import com.ottamen.cantina_api.model.BevutiEntity;
import com.ottamen.cantina_api.service.BevutiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BevutiController {

    @Autowired
    private BevutiService bevutiService;

    @GetMapping("/bevuti")
    public Iterable<BevutiEntity> getBevuti() {
        return bevutiService.findAll();
    }

    @GetMapping("/bevuti/{id}")
    public Optional<BevutiEntity> getBevutiById(@PathVariable Long id) {
        return bevutiService.findById(id);
    }
}
