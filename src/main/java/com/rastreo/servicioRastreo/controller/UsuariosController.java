package com.rastreo.servicioRastreo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rastreo.servicioRastreo.dao.IUsuarioDAO;
import com.rastreo.servicioRastreo.entity.Usuarios;

@RestController
public class UsuariosController {

	@Autowired
	private IUsuarioDAO usuarios;
	
	@CrossOrigin(origins="*")
	@GetMapping("/obtener/usuarios")
	private List<Usuarios> obtenerUsuarios(){
		return this.usuarios.findAll();
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/validar/usuarios")
	private Usuarios validarUsuario(@RequestBody Usuarios usuario){
		return this.usuarios.comprobarUsuario(usuario.getUsuario(),usuario.getPassword());
	}
}
