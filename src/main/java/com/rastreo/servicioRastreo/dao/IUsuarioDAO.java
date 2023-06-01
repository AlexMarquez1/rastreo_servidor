package com.rastreo.servicioRastreo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.Usuarios;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuarios, Integer>{
	
	@Query(value="SELECT * FROM usuarios WHERE usuario = :usuario and contrasena = :contrasena", nativeQuery = true )
	Usuarios comprobarUsuario(@Param("usuario") String usuario, @Param("contrasena") String contrasena);
	
	@Query(value="SELECT * FROM usuarios WHERE usuario = :usuario", nativeQuery = true )
	Usuarios comprobarUsuarioExistente(@Param("usuario") String usuario);
	
	@Query(value="SELECT * FROM usuarios WHERE nombre = :nombre", nativeQuery = true )
	Usuarios comprobarNombreExistente(@Param("nombre") String nombre);

}
