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
@Table(name = "viaje")
@NamedQuery(name = "Viaje.findAll", query = "SELECT v FROM Viaje v")
public class Viaje implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idviaje;
	String fechadelviaje;
	String fechainicioviaje;
	String duracionaproximada;
	String distanciaaproximada;
	String coordenadasinicio;
	String coordenadasfin;
	String direccioninicio;
	String direccionfin;
	String estatus;
	@OneToOne
	@JoinColumn(name="idusuario")
	Usuarios usuario;
	
	public Viaje() {
		super();
	}

	public Viaje(int idviaje, String fechadelviaje, String fechainicioviaje, String duracionaproximada,
			String distanciaaproximada, String coordenadasinicio, String coordenadasfin, String direccioninicio,
			String direccionfin, String estatus, Usuarios usuario) {
		super();
		this.idviaje = idviaje;
		this.fechadelviaje = fechadelviaje;
		this.fechainicioviaje = fechainicioviaje;
		this.duracionaproximada = duracionaproximada;
		this.distanciaaproximada = distanciaaproximada;
		this.coordenadasinicio = coordenadasinicio;
		this.coordenadasfin = coordenadasfin;
		this.direccioninicio = direccioninicio;
		this.direccionfin = direccionfin;
		this.estatus = estatus;
		this.usuario = usuario;
	}

	public int getIdviaje() {
		return idviaje;
	}

	public void setIdviaje(int idviaje) {
		this.idviaje = idviaje;
	}

	public String getFechadelviaje() {
		return fechadelviaje;
	}

	public void setFechadelviaje(String fechadelviaje) {
		this.fechadelviaje = fechadelviaje;
	}

	public String getFechainicioviaje() {
		return fechainicioviaje;
	}

	public void setFechainicioviaje(String fechainicioviaje) {
		this.fechainicioviaje = fechainicioviaje;
	}

	public String getDuracionaproximada() {
		return duracionaproximada;
	}

	public void setDuracionaproximada(String duracionaproximada) {
		this.duracionaproximada = duracionaproximada;
	}

	public String getDistanciaaproximada() {
		return distanciaaproximada;
	}

	public void setDistanciaaproximada(String distanciaaproximada) {
		this.distanciaaproximada = distanciaaproximada;
	}

	public String getCoordenadasinicio() {
		return coordenadasinicio;
	}

	public void setCoordenadasinicio(String coordenadasinicio) {
		this.coordenadasinicio = coordenadasinicio;
	}

	public String getCoordenadasfin() {
		return coordenadasfin;
	}

	public void setCoordenadasfin(String coordenadasfin) {
		this.coordenadasfin = coordenadasfin;
	}

	public String getDireccioninicio() {
		return direccioninicio;
	}

	public void setDireccioninicio(String direccioninicio) {
		this.direccioninicio = direccioninicio;
	}

	public String getDireccionfin() {
		return direccionfin;
	}

	public void setDireccionfin(String direccionfin) {
		this.direccionfin = direccionfin;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Viaje [idviaje=" + idviaje + ", fechadelviaje=" + fechadelviaje + ", fechainicioviaje="
				+ fechainicioviaje + ", duracionaproximada=" + duracionaproximada + ", distanciaaproximada="
				+ distanciaaproximada + ", coordenadasinicio=" + coordenadasinicio + ", coordenadasfin="
				+ coordenadasfin + ", direccioninicio=" + direccioninicio + ", direccionfin=" + direccionfin
				+ ", estatus=" + estatus + ", usuario=" + usuario + "]";
	}

}
