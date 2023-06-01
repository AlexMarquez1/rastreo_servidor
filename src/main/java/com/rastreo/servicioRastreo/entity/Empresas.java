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
@Table(name = "empresas")
@NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")
public class Empresas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idempresa;
	private String razonsocial;
	private String direccion;
	private String rfc;
	private String telefono;
	private String email;
	private String giro;

	@OneToOne
	@JoinColumn(name = "idusuario")
	private Usuarios usuario;

	public Empresas() {
	}

	public Empresas(int idempresa, String razonsocial, String direccion, String rfc, String telefono, String email,
			String giro, Usuarios usuario) {
		this.idempresa = idempresa;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.rfc = rfc;
		this.telefono = telefono;
		this.email = email;
		this.giro = giro;
		this.usuario = usuario;
	}

	public int getIdempresa() {
		return idempresa;
	}

	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Empresas [idempresa=" + idempresa + ", razonsocial=" + razonsocial + ", direccion=" + direccion
				+ ", rfc=" + rfc + ", telefono=" + telefono + ", email=" + email + ", giro=" + giro + ", usuario="
				+ usuario + "]";
	}

}
