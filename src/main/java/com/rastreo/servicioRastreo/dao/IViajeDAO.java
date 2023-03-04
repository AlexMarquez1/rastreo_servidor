package com.rastreo.servicioRastreo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Viaje;

@Repository
public interface IViajeDAO extends JpaRepository<Viaje, Integer> {

	@Query(value="SELECT * FROM viaje WHERE idusuario = :idusuario", nativeQuery = true )
	List<Viaje> obtenerViajesPoridUsuario(@Param("idusuario") int idusuario);
}
