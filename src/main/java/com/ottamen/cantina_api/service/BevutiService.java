package com.ottamen.cantina_api.service;

import com.ottamen.cantina_api.model.BevutiEntity;
import com.ottamen.cantina_api.repository.BevutiRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class BevutiService {

    @Autowired
    private BevutiRepository bevutiRepository;

    public Optional<BevutiEntity> findById(Long id) {
        return bevutiRepository.findById(id);
    }

    public Iterable<BevutiEntity> findAll() {
        return bevutiRepository.findAll();
    }
}
