package com.rastreo.servicioRastreo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rastreo.servicioRastreo.dao.IViajeDAO;
import com.rastreo.servicioRastreo.entity.Usuarios;
import com.rastreo.servicioRastreo.entity.Viaje;

@RestController
public class ViajesController {

	@Autowired
	private IViajeDAO viajes;
	
	@CrossOrigin(origins="*")
	@GetMapping("/obtener/viajes")
	public List<Viaje> obtenerViajes(){
		return this.viajes.findAll();
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/obtener/viajes/usuario")
	private List<Viaje> obtenerViajesPorIdUsuario(@RequestBody Usuarios usuario){
		List<Viaje> respuesta = this.viajes.obtenerViajesPoridUsuario(usuario.getIdusuario());
		return respuesta;
	}
}
