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
@Table(name="marcadores")
@NamedQuery(name="Marcadores.findAll", query="SELECT m FROM Marcadores m")
public class Marcadores implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idMarcador;
	
	@OneToOne
	@JoinColumn(name="idviaje")
	private Viajes viaje;
	
	private String lat;
	private String lng;
	private String tipo;
	private String descripcion;
	private String hora;
	private Date fecha;
	
	public Marcadores() {
	}

	public Marcadores(int idMarcador, Viajes viaje, String lat, String lng, String tipo, String descripcion,
			String hora, Date fecha) {
		this.idMarcador = idMarcador;
		this.viaje = viaje;
		this.lat = lat;
		this.lng = lng;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.hora = hora;
		this.fecha = fecha;
	}

	public int getIdMarcador() {
		return idMarcador;
	}

	public void setIdMarcador(int idMarcador) {
		this.idMarcador = idMarcador;
	}

	public Viajes getViaje() {
		return viaje;
	}

	public void setViaje(Viajes viaje) {
		this.viaje = viaje;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		return "Marcadores [idMarcador=" + idMarcador + ", viaje=" + viaje + ", lat=" + lat + ", lng=" + lng + ", tipo="
				+ tipo + ", descripcion=" + descripcion + ", hora=" + hora + ", fecha=" + fecha + "]";
	}
	
}
