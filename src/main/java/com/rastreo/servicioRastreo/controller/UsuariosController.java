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
		//Comprueba que el usuario y la contraseña sean correctos y devuelve el objeto del usuario en caso de que sean correctos
		return this.usuarios.comprobarUsuario(usuario.getUsuario(),usuario.getContrasena());
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/nuevo/usuario")
	private String nuevoUsuario(@RequestBody Usuarios usuario){
		String respuesta = "";
		Usuarios usuarioComprobar = null;
		try {
			
			usuarioComprobar = this.usuarios.comprobarUsuarioExistente(usuario.getUsuario());
			
			if(usuarioComprobar != null) {
				return respuesta = "Usuario existente";
			}
			
			usuarioComprobar = this.usuarios.comprobarNombreExistente(usuario.getNombre());
			if(usuarioComprobar != null) {
				return respuesta = "Nombre de usuario existente";
			}
			
			this.usuarios.save(usuario);
			respuesta = "usuario guardado";
		} catch (Exception e) {
			respuesta = "Error al registrar usuario";
		}
		return respuesta;
	}
}
