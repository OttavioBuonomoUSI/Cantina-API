package com.ottamen.cantina_api.repository;

import com.ottamen.cantina_api.model.Tipo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends CrudRepository<Tipo, Long> {

    @Query("SELECT t FROM Tipo t ORDER BY t.tipo ASC")
    Iterable<Tipo> findAllTipoOrderedAsc();

    @Query("SELECT t FROM Tipo t ORDER BY t.tipo DESC")
    Iterable<Tipo> findAllTipoOrderedDesc();
}
