package com.rastreo.servicioRastreo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="perfiles")
@NamedQuery(name="Perfiles.findAll", query="SELECT p FROM Perfiles p")
public class Perfiles implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int idperfil;
	String perfil;
	
	public Perfiles(int idPerfil, String perfil) {
		super();
		this.idperfil = idPerfil;
		this.perfil = perfil;
	}

	public Perfiles() {
		super();
	}

	public int getIdPerfil() {
		return idperfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idperfil = idPerfil;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Perfiles [idPerfil=" + idperfil + ", perfil=" + perfil + "]";
	}
	
}
