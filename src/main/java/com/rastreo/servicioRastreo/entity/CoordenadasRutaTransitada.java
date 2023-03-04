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
@Table(name = "Coordenadasrutatransitada")
@NamedQuery(name="CoordenadasRutaTransitada", query="SELECT c FROM CoordenadasRutaTransitada c")
public class CoordenadasRutaTransitada implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int idcoordenadas;
	String lat;
	String lng;
	@OneToOne
	@JoinColumn(name="idviaje")
	Viaje viaje;
	
	public CoordenadasRutaTransitada() {
		super();
	}

	public CoordenadasRutaTransitada(int idcoordenadas, String lat, String lng, Viaje viaje) {
		super();
		this.idcoordenadas = idcoordenadas;
		this.lat = lat;
		this.lng = lng;
		this.viaje = viaje;
	}

	public int getIdcoordenadas() {
		return idcoordenadas;
	}

	public void setIdcoordenadas(int idcoordenadas) {
		this.idcoordenadas = idcoordenadas;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	@Override
	public String toString() {
		return "CoordenadasRutaViaje [idcoordenadas=" + idcoordenadas + ", lat=" + lat + ", lng=" + lng + ", viaje="
				+ viaje + "]";
	}

}
