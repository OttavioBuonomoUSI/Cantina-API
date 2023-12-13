package com.ottamen.cantina_api.service;

import com.ottamen.cantina_api.model.DimensioniEntity;
import com.ottamen.cantina_api.repository.DimensioniRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class DimensioniService {

    @Autowired
    private DimensioniRepository dimensioniRepository;

    public Optional<DimensioniEntity> getDimensioneById(Long id) {
        return dimensioniRepository.findById(id);
    }

    public Iterable<DimensioniEntity> getDimensioni() {
        return dimensioniRepository.findAll();
    }
}
