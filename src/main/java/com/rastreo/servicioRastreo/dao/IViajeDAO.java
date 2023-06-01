package com.rastreo.servicioRastreo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Viajes;

@Repository
public interface IViajeDAO extends JpaRepository<Viajes, Integer> {

	@Query(value="SELECT * FROM viaje WHERE idusuario = :idusuario", nativeQuery = true )
	List<Viajes> obtenerViajesPoridUsuario(@Param("idusuario") int idusuario);
	
	@Query(value="SELECT * FROM viajes WHERE idconductor = :idconductor", nativeQuery = true )
	List<Viajes> obtenerViajesPoridConductor(@Param("idconductor") int idconductor);
}
