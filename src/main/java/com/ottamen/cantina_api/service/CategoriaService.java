package com.ottamen.cantina_api.service;

import com.ottamen.cantina_api.model.CategoriaEntity;
import com.ottamen.cantina_api.repository.CategoriaRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Optional<CategoriaEntity> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public Iterable<CategoriaEntity> findAll() {
        return categoriaRepository.findAll();
    }
}
