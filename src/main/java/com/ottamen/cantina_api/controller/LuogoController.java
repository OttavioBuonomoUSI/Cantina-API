package com.ottamen.cantina_api.controller;

import com.ottamen.cantina_api.model.Luogo;
import com.ottamen.cantina_api.service.LuogoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class LuogoController {

    @Autowired
    private LuogoService luogoService;

    @GetMapping("/luoghi")
    public Iterable<Luogo> getLuoghi() {
        return luogoService.getLuoghi();
    }

    @GetMapping("/luoghi/{id_luogo}")
    public Optional<Luogo> getLuogoById(@PathVariable(name = "id_luogo") Long id) {
        return luogoService.getLuogoById(id);
    }


}
