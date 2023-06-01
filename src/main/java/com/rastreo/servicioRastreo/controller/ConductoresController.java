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

import com.rastreo.servicioRastreo.dao.IConductorDAO;
import com.rastreo.servicioRastreo.entity.Conductores;

@RestController
public class ConductoresController {

	@Autowired
	private IConductorDAO conductores;
	
	@CrossOrigin(origins="*")
	@PostMapping("/nuevo/conductor")
	public Map<String,String> crearConductor(@RequestBody Conductores conductor) {
		Map<String,String> respuesta = new HashMap<String,String>();
		System.out.println(conductor);
		
		try {
			
			this.conductores.save(conductor);
			respuesta.put("respuesta", "Se registro correctamente");
		} catch (Exception e) {
			respuesta.put("respuesta", "Error al intentar registrar al conductor");
			System.out.println(e);
		}
		
		return respuesta;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/consultar/conductores")
	public List<Conductores> consultarConductores(){
		return this.conductores.findAll();
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/validar/conductor")
	private Conductores validarUsuario(@RequestBody Conductores conductor){
		System.out.println("Conductor: "+ conductor);
		Conductores conductorRespuesta = this.conductores.validarConductor(conductor.getUsuarioconductor(),conductor.getContrasena());
		System.out.println("Conductor Respuesta: " + conductorRespuesta);
		
		if(conductorRespuesta != null) {
			System.out.println("Usuario correcto");
			Conductores conductorToken = this.conductores.validarToken(conductor.getTokennotificacion());
			if(conductorToken == null) {
				System.out.println("Usuario sin token, agregando nuevo token");
				conductorRespuesta.setTokennotificacion(conductor.getTokennotificacion());
				this.conductores.save(conductorRespuesta);
			}else {
				if(conductorToken.getIdconductor() != conductorRespuesta.getIdconductor()) {
					System.out.println("Usuario con token, eliminando el token del usuario existente y asignandolo al usuario nuevo");
					conductorToken.setTokennotificacion("");
					this.conductores.save(conductorToken);
					conductorRespuesta.setTokennotificacion(conductor.getTokennotificacion());
					this.conductores.save(conductorRespuesta);
				}else {
					System.out.println("El token corresponde con el usuario");
				}
			}
		}
		
		return conductorRespuesta;
		
		
	}
	
	
}
