package com.ottamen.cantina_api.service;

import com.ottamen.cantina_api.model.Tipo;
import com.ottamen.cantina_api.repository.TipoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class TipoService {

    @Autowired
    private TipoRepository tipoRepository;

    public Optional<Tipo> getTipoById(Long id) {
        return tipoRepository.findById(id);
    }

    public Iterable<Tipo> getTipi() {
        return tipoRepository.findAll();
    }

    public void saveTipo(Tipo tipo) {
        tipoRepository.save(tipo);
    }

    public Iterable<Tipo> getTipiOrdered(String order) throws IllegalArgumentException {
        if (order.equalsIgnoreCase("asc")) {
            return tipoRepository.findAllTipoOrderedAsc();
        } else if (order.equalsIgnoreCase("desc")) {
            return tipoRepository.findAllTipoOrderedDesc();
        }
        throw new IllegalArgumentException("Order parameter must be asc or desc");
    }
}
