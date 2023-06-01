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
@Table(name="conductores")
@NamedQuery(name="Conductores.findAll", query="SELECT c FROM Conductores c")
public class Conductores implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idconductor;
	private String nombrecompleto;
	private Date fechanacimiento;
	private String email;
	private String telefono;
	private String curp;
	private String rfc;
	private String usuarioconductor;
	private String contrasena;
	private String calle;
	private String numeroexterior;
	private String numerointerior;
	private String codigopostal;
	private String estado;
	private String municipio;
	private String numerolicencia;
	private String tipolicencia;
	private String archivolicencia;
	private Date fechaexpedicion;
	private Date fechavencimiento;
	private String tiposangre;
	private String foto;
	private String licencia;
	private String identificacion;
	@OneToOne
	@JoinColumn(name="idusuario")
	private Usuarios usuario;
	
	private String tokennotificacion;
	
	public Conductores() {
	}

	public Conductores(int idconductor, String nombrecompleto, Date fechanacimiento, String email, String telefono,
			String curp, String rfc, String usuarioconductor, String contrasena, String calle, String numeroexterior,
			String numerointerior, String codigopostal, String estado, String municipio, String numerolicencia,
			String tipolicencia, String archivolicencia, Date fechaexpedicion, Date fechavencimiento, String tiposangre,
			String foto, String licencia, String identificacion, Usuarios usuario, String tokennotificacion) {
		super();
		this.idconductor = idconductor;
		this.nombrecompleto = nombrecompleto;
		this.fechanacimiento = fechanacimiento;
		this.email = email;
		this.telefono = telefono;
		this.curp = curp;
		this.rfc = rfc;
		this.usuarioconductor = usuarioconductor;
		this.contrasena = contrasena;
		this.calle = calle;
		this.numeroexterior = numeroexterior;
		this.numerointerior = numerointerior;
		this.codigopostal = codigopostal;
		this.estado = estado;
		this.municipio = municipio;
		this.numerolicencia = numerolicencia;
		this.tipolicencia = tipolicencia;
		this.archivolicencia = archivolicencia;
		this.fechaexpedicion = fechaexpedicion;
		this.fechavencimiento = fechavencimiento;
		this.tiposangre = tiposangre;
		this.foto = foto;
		this.licencia = licencia;
		this.identificacion = identificacion;
		this.usuario = usuario;
		this.tokennotificacion = tokennotificacion;
	}

	public int getIdconductor() {
		return idconductor;
	}

	public void setIdconductor(int idconductor) {
		this.idconductor = idconductor;
	}

	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getUsuarioconductor() {
		return usuarioconductor;
	}

	public void setUsuarioconductor(String usuarioconductor) {
		this.usuarioconductor = usuarioconductor;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeroexterior() {
		return numeroexterior;
	}

	public void setNumeroexterior(String numeroexterior) {
		this.numeroexterior = numeroexterior;
	}

	public String getNumerointerior() {
		return numerointerior;
	}

	public void setNumerointerior(String numerointerior) {
		this.numerointerior = numerointerior;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNumerolicencia() {
		return numerolicencia;
	}

	public void setNumerolicencia(String numerolicencia) {
		this.numerolicencia = numerolicencia;
	}

	public String getTipolicencia() {
		return tipolicencia;
	}

	public void setTipolicencia(String tipolicencia) {
		this.tipolicencia = tipolicencia;
	}

	public String getArchivolicencia() {
		return archivolicencia;
	}

	public void setArchivolicencia(String archivolicencia) {
		this.archivolicencia = archivolicencia;
	}

	public Date getFechaexpedicion() {
		return fechaexpedicion;
	}

	public void setFechaexpedicion(Date fechaexpedicion) {
		this.fechaexpedicion = fechaexpedicion;
	}

	public Date getFechavencimiento() {
		return fechavencimiento;
	}

	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public String getTiposangre() {
		return tiposangre;
	}

	public void setTiposangre(String tiposangre) {
		this.tiposangre = tiposangre;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public String getTokennotificacion() {
		return tokennotificacion;
	}

	public void setTokennotificacion(String tokennotificacion) {
		this.tokennotificacion = tokennotificacion;
	}

	@Override
	public String toString() {
		return "Conductores [idconductor=" + idconductor + ", nombrecompleto=" + nombrecompleto + ", fechanacimiento="
				+ fechanacimiento + ", email=" + email + ", telefono=" + telefono + ", curp=" + curp + ", rfc=" + rfc
				+ ", usuarioconductor=" + usuarioconductor + ", contrasena=" + contrasena + ", calle=" + calle
				+ ", numeroexterior=" + numeroexterior + ", numerointerior=" + numerointerior + ", codigopostal="
				+ codigopostal + ", estado=" + estado + ", municipio=" + municipio + ", numerolicencia="
				+ numerolicencia + ", tipolicencia=" + tipolicencia + ", archivolicencia=" + archivolicencia
				+ ", fechaexpedicion=" + fechaexpedicion + ", fechavencimiento=" + fechavencimiento + ", tiposangre="
				+ tiposangre + ", foto=" + foto + ", licencia=" + licencia + ", identificacion=" + identificacion
				+ ", usuario=" + usuario + ", tokennotificacion=" + tokennotificacion + "]";
	}

	
}
