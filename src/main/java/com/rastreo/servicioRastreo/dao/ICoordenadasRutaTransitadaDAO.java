package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.CoordenadasRutaTransitada;

@Repository
public interface ICoordenadasRutaTransitadaDAO extends JpaRepository<CoordenadasRutaTransitada, Integer> {

}
