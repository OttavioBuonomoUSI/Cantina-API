package com.ottamen.cantina_api.controller;

import com.ottamen.cantina_api.model.Tipo;
import com.ottamen.cantina_api.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TipoController {

    @Autowired
    private TipoService tipoService;

    @GetMapping("/tipi")
    public Iterable getTipi() {
        return tipoService.getTipi();
    }

    @GetMapping("/tipi/{id}")
    public Optional<Tipo> getTipoById(@PathVariable Long id) {
        return tipoService.getTipoById(id);
    }

    @GetMapping("/tipi/ordered/{order}")
    public Iterable<Tipo> getTipiOrdered(@PathVariable String order) {
        return tipoService.getTipiOrdered(order);
    }
}
