package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.RutaViajeReal;

@Repository
public interface IRutaViajeRealDAO extends JpaRepository<RutaViajeReal, Integer> {

}
