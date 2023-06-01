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
@Table(name="vehiculos")
@NamedQuery(name="Vehiculos.findAll", query="SELECT v FROM Vehiculos v")
public class Vehiculos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idvehiculo;
	
	private String tipovehiculo;
	private String marca;
	private String modelo;
	private String placas;
	private String numeroserie;
	private String nombreseguro;
	private String numeropoliza;
	private String telefonoaseguradora;
	private String webaseguradora;
	private Date fechaaltaseguro;
	private Date fechavencimientoseguro;
	private String archivotarjetacirculacion;
	private String archivopolizaseguro;
	
	@OneToOne
	@JoinColumn(name="idusuario")
	private Usuarios usuario;

	public Vehiculos() {
		super();
	}

	public Vehiculos(int idvehiculo, String tipovehiculo, String marca, String modelo, String placas,
			String numeroserie, String nombreseguro, String numeropoliza, String telefonoaseguradora,
			String webaseguradora, Date fechaaltaseguro, Date fechavencimientoseguro, String archivotarjetacirculacion,
			String archivopolizaseguro, Usuarios usuario) {
		super();
		this.idvehiculo = idvehiculo;
		this.tipovehiculo = tipovehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.placas = placas;
		this.numeroserie = numeroserie;
		this.nombreseguro = nombreseguro;
		this.numeropoliza = numeropoliza;
		this.telefonoaseguradora = telefonoaseguradora;
		this.webaseguradora = webaseguradora;
		this.fechaaltaseguro = fechaaltaseguro;
		this.fechavencimientoseguro = fechavencimientoseguro;
		this.archivotarjetacirculacion = archivotarjetacirculacion;
		this.archivopolizaseguro = archivopolizaseguro;
		this.usuario = usuario;
	}

	public int getIdvehiculo() {
		return idvehiculo;
	}

	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public String getTipovehiculo() {
		return tipovehiculo;
	}

	public void setTipovehiculo(String tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getNumeroserie() {
		return numeroserie;
	}

	public void setNumeroserie(String numeroserie) {
		this.numeroserie = numeroserie;
	}

	public String getNombreseguro() {
		return nombreseguro;
	}

	public void setNombreseguro(String nombreseguro) {
		this.nombreseguro = nombreseguro;
	}

	public String getNumeropoliza() {
		return numeropoliza;
	}

	public void setNumeropoliza(String numeropoliza) {
		this.numeropoliza = numeropoliza;
	}

	public String getTelefonoaseguradora() {
		return telefonoaseguradora;
	}

	public void setTelefonoaseguradora(String telefonoaseguradora) {
		this.telefonoaseguradora = telefonoaseguradora;
	}

	public String getWebaseguradora() {
		return webaseguradora;
	}

	public void setWebaseguradora(String webaseguradora) {
		this.webaseguradora = webaseguradora;
	}

	public Date getFechaaltaseguro() {
		return fechaaltaseguro;
	}

	public void setFechaaltaseguro(Date fechaaltaseguro) {
		this.fechaaltaseguro = fechaaltaseguro;
	}

	public Date getFechavencimientoseguro() {
		return fechavencimientoseguro;
	}

	public void setFechavencimientoseguro(Date fechavencimientoseguro) {
		this.fechavencimientoseguro = fechavencimientoseguro;
	}

	public String getArchivotarjetacirculacion() {
		return archivotarjetacirculacion;
	}

	public void setArchivotarjetacirculacion(String archivotarjetacirculacion) {
		this.archivotarjetacirculacion = archivotarjetacirculacion;
	}

	public String getArchivopolizaseguro() {
		return archivopolizaseguro;
	}

	public void setArchivopolizaseguro(String archivopolizaseguro) {
		this.archivopolizaseguro = archivopolizaseguro;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Vehiculos [idvehiculo=" + idvehiculo + ", tipovehiculo=" + tipovehiculo + ", marca=" + marca
				+ ", modelo=" + modelo + ", placas=" + placas + ", numeroserie=" + numeroserie + ", nombreseguro="
				+ nombreseguro + ", numeropoliza=" + numeropoliza + ", telefonoaseguradora=" + telefonoaseguradora
				+ ", webaseguradora=" + webaseguradora + ", fechaaltaseguro=" + fechaaltaseguro
				+ ", fechavencimientoseguro=" + fechavencimientoseguro + ", archivotarjetacirculacion="
				+ archivotarjetacirculacion + ", archivopolizaseguro=" + archivopolizaseguro + ", usuario=" + usuario
				+ "]";
	}

}
