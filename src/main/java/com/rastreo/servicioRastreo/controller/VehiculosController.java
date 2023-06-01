package com.rastreo.servicioRastreo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rastreo.servicioRastreo.dao.IVehiculoDAO;
import com.rastreo.servicioRastreo.entity.Vehiculos;

@RestController
public class VehiculosController {
	
	@Autowired
	private IVehiculoDAO vehiculos;
	
	@CrossOrigin(origins="*")
	@GetMapping("/consultar/vehiculos")
	public List<Vehiculos> obtenerVehiculos(){
		
		return this.vehiculos.findAll();
		
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/nuevo/vehiculo")
	public Map<String,String> obtenerArchivo(@RequestBody Vehiculos vehiculo){
		Map<String,String> respuesta = new HashMap<String,String>();
		
		try {			
			this.vehiculos.save(vehiculo);
			respuesta.put("respuesta", "Se registro correctamenta");
		} catch (Exception e) {
			respuesta.put("respuesta", "Error al intentar guardar el vehiculo");
		}
		
		return respuesta;
		
	}

}
