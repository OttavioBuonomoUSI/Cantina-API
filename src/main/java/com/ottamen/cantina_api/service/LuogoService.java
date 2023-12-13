package com.ottamen.cantina_api.service;

import com.ottamen.cantina_api.model.Luogo;
import com.ottamen.cantina_api.repository.LuogoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class LuogoService {

    @Autowired
    private LuogoRepository luogoRepository;

    public Optional<Luogo> getLuogoById(Long id) {
        return luogoRepository.findById(id);
    }

    public Iterable<Luogo> getLuoghi() {
        return luogoRepository.findAll();
    }

    public void save(Luogo luogo) {
        luogoRepository.save(luogo);
    }
}
