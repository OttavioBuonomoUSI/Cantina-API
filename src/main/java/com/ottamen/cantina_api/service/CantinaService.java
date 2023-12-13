package com.ottamen.cantina_api.service;

import com.ottamen.cantina_api.model.DimensioniEntity;
import com.ottamen.cantina_api.model.ViniEntity;
import com.ottamen.cantina_api.repository.ViniRepository;
import org.antlr.v4.runtime.misc.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CantinaService {

    @Autowired
    private ViniRepository viniRepository;

    public Pair<Integer, Double> sumVini() {
        final Iterable<ViniEntity> vini = viniRepository.findAll();
        Double sum = 0.0;
        Integer bottiglie = 0;
        for (ViniEntity vino : vini) {
            bottiglie += vino.getQuantita();
            final DimensioniEntity dimensioni = vino.getDimensione();
            sum += Double.parseDouble(dimensioni.getSize()) * vino.getQuantita();
        }
        return new Pair<>(bottiglie, sum);
    }
}
