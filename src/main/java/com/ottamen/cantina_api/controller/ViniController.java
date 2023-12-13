package com.ottamen.cantina_api.controller;

import com.ottamen.cantina_api.model.ViniEntity;
import com.ottamen.cantina_api.service.CantinaService;
import com.ottamen.cantina_api.service.ViniService;
import org.antlr.v4.runtime.misc.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ViniController {

    @Autowired
    private ViniService viniService;

    @Autowired
    private CantinaService cantinaService;

    @CrossOrigin(origins = "*")
    @GetMapping("/vini")
    public Iterable<ViniEntity> findAll() {
        return viniService.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/vini/{id}")
    public Optional<ViniEntity> findById(@PathVariable Long id) {
        return viniService.findById(id);
    }

    @GetMapping(path="/vini/sum", produces = "application/json")
    public String sumVini() throws JSONException {
        Pair<Integer, Double> result = cantinaService.sumVini();
        // return json with totalBottles and totalLiters, key names are "bottles" and "liters"
        JSONObject json = new JSONObject();
        json.put("bottles", result.a);
        json.put("liters", result.b);
        return json.toString();
    }

}
