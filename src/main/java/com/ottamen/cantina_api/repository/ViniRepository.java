package com.ottamen.cantina_api.repository;

import com.ottamen.cantina_api.model.ViniEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViniRepository extends CrudRepository<ViniEntity, Long> {

}
