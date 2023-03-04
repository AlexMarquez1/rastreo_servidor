package com.rastreo.servicioRastreo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuarios.findAll", query="SELECT u FROM Usuarios u")
public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int idusuario;
	String password;
	String usuario;
	String nombre;
	String telefonocontacto;
	@OneToOne
	@JoinColumn(name="idperfil")
	Perfiles perfil;
	
	public Usuarios() {
		super();
	}

	public Usuarios(int idusuario, String password, String usuario, String nombre, String telefonocontacto,
			Perfiles perfil) {
		super();
		this.idusuario = idusuario;
		this.password = password;
		this.usuario = usuario;
		this.nombre = nombre;
		this.telefonocontacto = telefonocontacto;
		this.perfil = perfil;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefonocontacto() {
		return telefonocontacto;
	}

	public void setTelefonocontacto(String telefonocontacto) {
		this.telefonocontacto = telefonocontacto;
	}

	public Perfiles getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfiles perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Usuarios [idusuario=" + idusuario + ", password=" + password + ", usuario=" + usuario + ", nombre="
				+ nombre + ", telefonocontacto=" + telefonocontacto + ", perfil=" + perfil + "]";
	}


}