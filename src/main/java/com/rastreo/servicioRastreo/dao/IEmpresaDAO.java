package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Empresas;

@Repository
public interface IEmpresaDAO extends JpaRepository<Empresas, Integer> {

}
