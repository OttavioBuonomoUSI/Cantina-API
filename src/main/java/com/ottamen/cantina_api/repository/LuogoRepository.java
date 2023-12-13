package com.ottamen.cantina_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ottamen.cantina_api.model.Luogo;

@Repository
public interface LuogoRepository extends CrudRepository<Luogo, Long> {}
