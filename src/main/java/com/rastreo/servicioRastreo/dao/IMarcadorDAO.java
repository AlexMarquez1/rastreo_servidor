package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Marcadores;

@Repository
public interface IMarcadorDAO extends JpaRepository<Marcadores, Integer> {

}
