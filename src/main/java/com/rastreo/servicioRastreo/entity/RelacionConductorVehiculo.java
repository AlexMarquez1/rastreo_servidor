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
@Table(name = "relacionconductorvehiculo")
@NamedQuery(name = "RelacionConductorVehiculo.findAll", query = "SELECT r FROM RelacionConductorVehiculo r")
public class RelacionConductorVehiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idrelacion;
	
	@OneToOne
	@JoinColumn(name="idconductor")
	private Conductores conductor;
	
	@OneToOne
	@JoinColumn(name="idvehiculo")
	private Vehiculos vehiculo;

	public RelacionConductorVehiculo() {
	}

	public RelacionConductorVehiculo(int idrelacion, Conductores conductor, Vehiculos vehiculo) {
		this.idrelacion = idrelacion;
		this.conductor = conductor;
		this.vehiculo = vehiculo;
	}

	public int getIdrelacion() {
		return idrelacion;
	}

	public void setIdrelacion(int idrelacion) {
		this.idrelacion = idrelacion;
	}

	public Conductores getConductor() {
		return conductor;
	}

	public void setConductor(Conductores conductor) {
		this.conductor = conductor;
	}

	public Vehiculos getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculos vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "RelacionConductorVehiculo [idrelacion=" + idrelacion + ", conductor=" + conductor + ", vehiculo="
				+ vehiculo + "]";
	}

}
