package com.rastreo.servicioRastreo.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "rutaviajereal")
@NamedQuery(name = "RutaViajeReal.findAll", query = "SELECT r FROM RutaViajeReal r")
public class RutaViajeReal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idruta;
	private String lat;
	private String lng;
	
	@OneToOne
	@JoinColumn(name="idviaje")
	private Viajes viaje;
	private String hora;
	private Date fecha;
	
	public RutaViajeReal() {
	}
	
	public RutaViajeReal(int idruta, String lat, String lng, Viajes viaje, String hora, Date fecha) {
		this.idruta = idruta;
		this.lat = lat;
		this.lng = lng;
		this.viaje = viaje;
		this.hora = hora;
		this.fecha = fecha;
	}

	public int getIdruta() {
		return idruta;
	}

	public void setIdruta(int idruta) {
		this.idruta = idruta;
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

	public Viajes getViaje() {
		return viaje;
	}

	public void setViaje(Viajes viaje) {
		this.viaje = viaje;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "RutaViajeReal [idruta=" + idruta + ", lat=" + lat + ", lng=" + lng + ", viaje=" + viaje + ", hora="
				+ hora + ", fecha=" + fecha + "]";
	}

}
