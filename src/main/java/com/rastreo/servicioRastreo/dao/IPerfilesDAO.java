package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Perfiles;


@Repository
public interface IPerfilesDAO extends JpaRepository<Perfiles, Integer>{

}
