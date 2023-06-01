package com.rastreo.servicioRastreo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuarios.findAll", query="SELECT u FROM Usuarios u")
public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idusuario;
	private String nombre;
	private String usuario;
	private String email;
	private String telefono;
	private String contrasena;
	private String perfil;
	
	public Usuarios() {
	}
	
	public Usuarios(int idusuario, String nombre, String usuario, String email, String telefono, String contrasena,
			String perfil) {
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.usuario = usuario;
		this.email = email;
		this.telefono = telefono;
		this.contrasena = contrasena;
		this.perfil = perfil;
	}
	
	public int getIdusuario() {
		return idusuario;
	}
	
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String getPerfil() {
		return perfil;
	}
	
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	@Override
	public String toString() {
		return "Usuarios [idusuario=" + idusuario + ", nombre=" + nombre + ", usuario=" + usuario + ", email=" + email
				+ ", telefono=" + telefono + ", contrasena=" + contrasena + ", perfil=" + perfil + "]";
	}
}