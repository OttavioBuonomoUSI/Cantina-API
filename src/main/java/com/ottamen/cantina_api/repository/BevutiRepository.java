package com.ottamen.cantina_api.repository;

import com.ottamen.cantina_api.model.BevutiEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevutiRepository extends CrudRepository<BevutiEntity, Long> {
}
