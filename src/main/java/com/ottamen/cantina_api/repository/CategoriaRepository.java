package com.ottamen.cantina_api.repository;

import com.ottamen.cantina_api.model.CategoriaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<CategoriaEntity, Long> {
}
