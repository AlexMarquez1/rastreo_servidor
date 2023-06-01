package com.rastreo.servicioRastreo.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rastreo.servicioRastreo.dao.IConductorDAO;
import com.rastreo.servicioRastreo.dao.IViajeDAO;
import com.rastreo.servicioRastreo.entity.Conductores;
import com.rastreo.servicioRastreo.entity.Usuarios;
import com.rastreo.servicioRastreo.entity.Viajes;
import com.rastreo.servicioRastreo.service.FirebaseMessagingService;

@RestController
public class ViajesController {

	@Autowired
	private IViajeDAO viajes;
	
	@Autowired
	private IConductorDAO conductor;
	
	@Autowired
	private FirebaseMessagingService firebaseService;

	@CrossOrigin(origins = "*")
	@GetMapping("/obtener/viajes")
	public List<Viajes> obtenerViajes() {
		return this.viajes.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/obtener/viajes/usuario")
	private List<Viajes> obtenerViajesPorIdUsuario(@RequestBody Usuarios usuario) {
		List<Viajes> respuesta = this.viajes.obtenerViajesPoridUsuario(usuario.getIdusuario());
		return respuesta;
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/obtener/viajes/conductor")
	private List<Viajes> obtenerViajesPorIdConductor(@RequestBody Conductores conductor) {
		return this.viajes.obtenerViajesPoridConductor(conductor.getIdconductor());
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/nuevo/viaje")
	private Map<String,String> nuevoViaje(@RequestBody Viajes viaje) {
		Map<String,String> respuesta = new HashMap<String,String>();
		try {
			Conductores conductor = this.conductor.findById(viaje.getConductor().getIdconductor()).get();
			
			this.viajes.save(viaje);
			respuesta.put("respuesta", "Se registro el viaje correctamente");
			
			if(!conductor.getTokennotificacion().isBlank()) {
				System.out.println("Mandando notificacion");
				Map<String,String> informacion = new HashMap<String,String>();
				informacion.put("title", "Se te asigno un nuevo viaje");
				informacion.put("body", "Reviza las notificaciones dentro de la aplicacion para obtener mas detalles del viaje");
				informacion.put("sound", "notification.mpeg");
				informacion.put("image", "");
				
				Map<String,String> data = new HashMap<String,String>();
				
				
				firebaseService.sendNotification(informacion, data, conductor.getTokennotificacion());
				respuesta.put("respuestaNotificacion", "Se notifico al conductor");
			}else {
				//Guardar esta notificacion en la tabla para notificar al conductor cuando instale la aplicacion
				System.out.println("El conductor no tiene un token generado");
				respuesta.put("respuesta", "No se pudo notificar al conductor");
			}
			

			return respuesta;
		} catch (Exception e) {
			respuesta.put("respuesta", "Error al intentar registrar un viaje");
			return respuesta;
		}
	}

	@CrossOrigin(origins = "*")
//	@GetMapping( value= "/obtener/ruta/sugerida" produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(
		    value = "/obtener/ruta/sugerida", 
		    produces = MediaType.APPLICATION_JSON_VALUE
		)
	private String obtenerRutaSugerida() {
		String respuesta = "";
		String apiKey = "AIzaSyAwXqH5JgdnOqOJy8F8_PrkvOqLtHhy60I";


//		parametros.add("origin", "19.411199570261783,-99.16623518563479");
//		parametros.add("destination", "19.144911543602653,-96.14266537792136");
//		parametros.add("mode", "driving");
//		parametros.add("avoidHighways", "false");
//		parametros.add("avoidFerries", "false");
//		parametros.add("avoidTolls", "false");
//		parametros.add("key", apiKey);

		
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://maps.googleapis.com/maps/api/directions/json?origin=Brooklyn&destination=Queens&mode=driving&key="+apiKey))
              .GET()
              .header("Content-Type", "application/json")
              .build();
        
        
        try {
        HttpResponse<String> res=client.send(request, BodyHandlers.ofString());
        respuesta = res.body();
      } catch (IOException | InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } 

		return respuesta;
	}

}
