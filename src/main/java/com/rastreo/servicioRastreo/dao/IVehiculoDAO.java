package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Vehiculos;

@Repository
public interface IVehiculoDAO extends JpaRepository<Vehiculos, Integer> {

}
