package com.ottamen.cantina_api.repository;

import com.ottamen.cantina_api.model.DimensioniEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensioniRepository extends CrudRepository<DimensioniEntity, Long> {
}
