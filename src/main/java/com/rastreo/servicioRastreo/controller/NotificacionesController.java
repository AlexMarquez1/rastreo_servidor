package com.rastreo.servicioRastreo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.firebase.messaging.FirebaseMessagingException;
import com.rastreo.servicioRastreo.service.FirebaseMessagingService;

@RestController
public class NotificacionesController {
	
	@Autowired
	private FirebaseMessagingService firebaseService;

	@CrossOrigin(origins = "*")
	@GetMapping("/nueva/notificacion")
	public String nuevaConfiguracion() throws FirebaseMessagingException {
		String respuesta = "";
		
		Map<String,String> informacion = new HashMap<String,String>();
		informacion.put("title", "Se te asigno un nuevo viaje");
		informacion.put("body", "Reviza las notificaciones dentro de la aplicacion para obtener mas detalles del viaje");
		informacion.put("sound", "notification.mpeg");
		informacion.put("image", "");
		
		String token = "d9Eu4sN_RdOYqp5mNSd5Sc:APA91bEo0eIeL6F6tq0-UES078Cgl1RAqhvFr-wHa4YZ3XDMOI-eYJkdLWxLdYj9uODUiJzXUnCKm59yIYxffA155A036DjedGHtUviO0w-VSrZZWtB2LMzzCGE34hNLnsa00qe98GBF";
		
		
		Map<String,String> data = new HashMap<String,String>();
		
		respuesta = firebaseService.sendNotification(informacion, data, token); 
		
		return respuesta;
	}
}
