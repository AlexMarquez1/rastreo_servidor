package com.rastreo.servicioRastreo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rastreo.servicioRastreo.dao.IPerfilesDAO;
import com.rastreo.servicioRastreo.entity.Perfiles;

@RestController
public class PerfilesController {
	
	@Autowired
	private IPerfilesDAO perfiles;
	
	@CrossOrigin(origins="*")
	@GetMapping("/obtener/perfiles")
	public List<Perfiles> obtenerPerfiles(){
		System.out.println("Obtener Perfiles");
		return this.perfiles.findAll();
	}

}
