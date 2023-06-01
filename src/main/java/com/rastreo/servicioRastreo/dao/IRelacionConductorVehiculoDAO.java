package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.RelacionConductorVehiculo;

@Repository
public interface IRelacionConductorVehiculoDAO extends JpaRepository<RelacionConductorVehiculo, Integer>{

}
