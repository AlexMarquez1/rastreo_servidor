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
@Table(name = "viajes")
@NamedQuery(name = "Viajes.findAll", query = "SELECT v FROM Viajes v")
public class Viajes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idviaje;
	
	@OneToOne
	@JoinColumn(name="idempresa")
	private Empresas empresa;
	
	@OneToOne
	@JoinColumn(name="idconductor")
	private Conductores conductor;
	
	@OneToOne
	@JoinColumn(name="idvehiculo")
	private Vehiculos vehiculo;
	
	private String tiposervicio;
	private String descripcion;
	private Date fechasalida;
	private Date fechallegada;
	private String direccionpartida;
	private String direccionllegada;
	private String latpartida;
	private String lngpartida;
	private String latllegada;
	private String lngllegada;
	private String horapartida;
	private String horallegada;
	private String distanciaaprox;
	private String estatus;
	private String reporte;
	
	@OneToOne
	@JoinColumn(name="idusuario")
	private Usuarios usuario;

	public Viajes() {
	}

	public Viajes(int idviaje, Empresas empresa, Conductores conductor, Vehiculos vehiculo, String tiposervicio,
			String descripcion, Date fechasalida, Date fechallegada, String direccionpartida, String direccionllegada,
			String latpartida, String lngpartida, String latllegada, String lngllegada, String horapartida,
			String horallegada, String distanciaaprox, String estatus, String reporte, Usuarios usuario) {
		this.idviaje = idviaje;
		this.empresa = empresa;
		this.conductor = conductor;
		this.vehiculo = vehiculo;
		this.tiposervicio = tiposervicio;
		this.descripcion = descripcion;
		this.fechasalida = fechasalida;
		this.fechallegada = fechallegada;
		this.direccionpartida = direccionpartida;
		this.direccionllegada = direccionllegada;
		this.latpartida = latpartida;
		this.lngpartida = lngpartida;
		this.latllegada = latllegada;
		this.lngllegada = lngllegada;
		this.horapartida = horapartida;
		this.horallegada = horallegada;
		this.distanciaaprox = distanciaaprox;
		this.estatus = estatus;
		this.reporte = reporte;
		this.usuario = usuario;
	}

	public int getIdviaje() {
		return idviaje;
	}

	public void setIdviaje(int idviaje) {
		this.idviaje = idviaje;
	}

	public Empresas getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresas empresa) {
		this.empresa = empresa;
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

	public String getTiposervicio() {
		return tiposervicio;
	}

	public void setTiposervicio(String tiposervicio) {
		this.tiposervicio = tiposervicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechasalida() {
		return fechasalida;
	}

	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}

	public Date getFechallegada() {
		return fechallegada;
	}

	public void setFechallegada(Date fechallegada) {
		this.fechallegada = fechallegada;
	}

	public String getDireccionpartida() {
		return direccionpartida;
	}

	public void setDireccionpartida(String direccionpartida) {
		this.direccionpartida = direccionpartida;
	}

	public String getDireccionllegada() {
		return direccionllegada;
	}

	public void setDireccionllegada(String direccionllegada) {
		this.direccionllegada = direccionllegada;
	}

	public String getLatpartida() {
		return latpartida;
	}

	public void setLatpartida(String latpartida) {
		this.latpartida = latpartida;
	}

	public String getLngpartida() {
		return lngpartida;
	}

	public void setLngpartida(String lngpartida) {
		this.lngpartida = lngpartida;
	}

	public String getLatllegada() {
		return latllegada;
	}

	public void setLatllegada(String latllegada) {
		this.latllegada = latllegada;
	}

	public String getLngllegada() {
		return lngllegada;
	}

	public void setLngllegada(String lngllegada) {
		this.lngllegada = lngllegada;
	}

	public String getHorapartida() {
		return horapartida;
	}

	public void setHorapartida(String horapartida) {
		this.horapartida = horapartida;
	}

	public String getHorallegada() {
		return horallegada;
	}

	public void setHorallegada(String horallegada) {
		this.horallegada = horallegada;
	}

	public String getDistanciaaprox() {
		return distanciaaprox;
	}

	public void setDistanciaaprox(String distanciaaprox) {
		this.distanciaaprox = distanciaaprox;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getReporte() {
		return reporte;
	}

	public void setReporte(String reporte) {
		this.reporte = reporte;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Viajes [idviaje=" + idviaje + ", empresa=" + empresa + ", conductor=" + conductor + ", vehiculo="
				+ vehiculo + ", tiposervicio=" + tiposervicio + ", descripcion=" + descripcion + ", fechasalida="
				+ fechasalida + ", fechallegada=" + fechallegada + ", direccionpartida=" + direccionpartida
				+ ", direccionllegada=" + direccionllegada + ", latpartida=" + latpartida + ", lngpartida=" + lngpartida
				+ ", latllegada=" + latllegada + ", lngllegada=" + lngllegada + ", horapartida=" + horapartida
				+ ", horallegada=" + horallegada + ", distanciaaprox=" + distanciaaprox + ", estatus=" + estatus
				+ ", reporte=" + reporte + ", usuario=" + usuario + "]";
	}
	
}
