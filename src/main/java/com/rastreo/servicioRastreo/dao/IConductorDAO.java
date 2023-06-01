package com.rastreo.servicioRastreo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Conductores;

@Repository
public interface IConductorDAO extends JpaRepository<Conductores, Integer>{
	
	@Query(value="SELECT * FROM conductores WHERE usuarioconductor =:usuario AND contrasena = :contrasena", nativeQuery = true )
	Conductores validarConductor(@Param("usuario") String usuario, @Param("contrasena") String contrasena );

	@Query(value="SELECT * FROM conductores WHERE tokennotificacion =:token", nativeQuery = true)
	Conductores validarToken(@Param("token") String token);
	
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query(value=
	 * "UPDATE conductores SET tokennotificacion = :estatus WHERE idinventario = :idinventario"
	 * , nativeQuery = true) void actualizar
	 */
}
