package com.rastreo.servicioRastreo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rastreo.servicioRastreo.entity.CoordenadasRutaViaje;

@Repository
public interface ICoordenadasRutaViajeDAO extends JpaRepository<CoordenadasRutaViaje, Integer> {
	
	@Query(value = "SELECT * FROM coordenadasrutaviaje WHERE idviaje =:idviaje", nativeQuery = true)
	List<CoordenadasRutaViaje> obtenerCoordenadasPorViaje(@Param("idviaje") int idviaje);

}
