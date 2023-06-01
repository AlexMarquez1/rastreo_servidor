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

import com.rastreo.servicioRastreo.dao.IEmpresaDAO;
import com.rastreo.servicioRastreo.entity.Empresas;

@RestController
public class EmpresasController {
	
	@Autowired
	private IEmpresaDAO empresas;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/consultar/empresas")
	public List<Empresas> consultarEmpresas(){
		return this.empresas.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/nueva/empresa")
	public List<Empresas> nuevaEmpresa(@RequestBody Empresas empresa) {
		
		System.out.println("Empresa: "+empresa);
		this.empresas.save(empresa);
		
		return this.empresas.findAll();
	}

}
