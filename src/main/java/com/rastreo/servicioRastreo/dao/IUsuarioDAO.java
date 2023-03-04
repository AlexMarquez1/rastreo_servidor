package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Usuarios;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuarios, Integer>{
	
	@Query(value="SELECT * FROM usuarios WHERE usuario = :usuario and password = :password", nativeQuery = true )
	Usuarios comprobarUsuario(@Param("usuario") String usuario, @Param("password") String password);

}
