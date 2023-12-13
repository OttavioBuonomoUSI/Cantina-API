package com.ottamen.cantina_api.service;

import com.ottamen.cantina_api.model.ViniEntity;
import com.ottamen.cantina_api.repository.ViniRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ViniService {

    @Autowired
    private ViniRepository viniRepository;

    public Iterable<ViniEntity> findAll() {
        return viniRepository.findAll();
    }

    public Optional<ViniEntity> findById(Long id) {
        return viniRepository.findById(id);
    }

//    public Iterable<ViniEntity> findAllViniWithAllInfo() {
//        return viniRepository.findAllViniWithAllInfo();
//    }
}
