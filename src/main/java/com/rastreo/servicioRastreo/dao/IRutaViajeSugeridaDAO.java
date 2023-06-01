package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.RutaViajeSugerida;

@Repository
public interface IRutaViajeSugeridaDAO extends JpaRepository<RutaViajeSugerida, Integer> {

}
