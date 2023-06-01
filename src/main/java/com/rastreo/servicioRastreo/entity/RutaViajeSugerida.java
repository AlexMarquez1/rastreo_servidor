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
@Table(name = "rutaviajesugerida")
@NamedQuery(name = "RutaViajeSugerida.findAll", query = "SELECT r FROM RutaViajeSugerida r")
public class RutaViajeSugerida implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idruta;
	
	private String ruta;
	
	@OneToOne
	@JoinColumn(name="idviaje")
	private Viajes viaje;

	public RutaViajeSugerida() {
	}

	public RutaViajeSugerida(int idruta, String ruta, Viajes viaje) {
		super();
		this.idruta = idruta;
		this.ruta = ruta;
		this.viaje = viaje;
	}

	public int getIdruta() {
		return idruta;
	}

	public void setIdruta(int idruta) {
		this.idruta = idruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Viajes getViaje() {
		return viaje;
	}

	public void setViaje(Viajes viaje) {
		this.viaje = viaje;
	}

	@Override
	public String toString() {
		return "RutaViajeSugerida [idruta=" + idruta + ", ruta=" + ruta + ", viaje=" + viaje + "]";
	}

}
