package com.rastreo.servicioRastreo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rastreo.servicioRastreo.dao.ICoordenadasRutaTransitadaDAO;
import com.rastreo.servicioRastreo.dao.ICoordenadasRutaViajeDAO;
import com.rastreo.servicioRastreo.entity.CoordenadasRutaViaje;
import com.rastreo.servicioRastreo.entity.Viaje;

@RestController
public class CoordenadasViajeController {
	
	@Autowired
	private ICoordenadasRutaViajeDAO coordenadasViaje;
	
	@Autowired ICoordenadasRutaTransitadaDAO coordenadasTransitada;
	
	@CrossOrigin(origins="*")
	@GetMapping("/obtener/todo/coordenadas/viaje")
	public List<CoordenadasRutaViaje> obtenerCoordenadasPorVisje(){
		return this.coordenadasViaje.findAll();
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/guardar/coordenadas/viaje")
	public void guardarRutaViaje(@RequestBody List<CoordenadasRutaViaje> listaCoordenadas) {
		List<CoordenadasRutaViaje> comprobarExistencia = this.coordenadasViaje.obtenerCoordenadasPorViaje(listaCoordenadas.get(0).getViaje().getIdviaje());
		if(!comprobarExistencia.isEmpty()) {
			
			this.coordenadasViaje.saveAll(listaCoordenadas);
		}else {
			System.out.println("Ruta ya guardada");
		}
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/obtener/coordenadas/viaje")
	public List<CoordenadasRutaViaje> obtenerCoordenadasPorVisje(@RequestBody Viaje viaje){
		return this.coordenadasViaje.obtenerCoordenadasPorViaje(viaje.getIdviaje());
	}

}
