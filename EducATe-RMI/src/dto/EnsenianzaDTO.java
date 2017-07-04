package dto;

import java.io.Serializable;
import java.util.Date;

public class EnsenianzaDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ID = 1;
	private static int NivelMax = 5;
	private int id;
	private LeccionDTO leccion;
	private int nivelRefuerzo;
	private Date fechaUltRepaso;
	
	public EnsenianzaDTO(int id, int nivelRefuerzo, Date fechaUltRepaso2) {
		this.id = id;
		this.nivelRefuerzo = nivelRefuerzo;
		fechaUltRepaso = fechaUltRepaso2;
	}

	
	public static int getID() {
		return ID;
	}
	public static void setID(int iD) {
		ID = iD;
	}
	public static int getNivelMax() {
		return NivelMax;
	}
	public static void setNivelMax(int nivelMax) {
		NivelMax = nivelMax;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LeccionDTO getLeccion() {
		return leccion;
	}
	public void setLeccion(LeccionDTO leccion) {
		this.leccion = leccion;
	}
	public int getNivelRefuerzo() {
		return nivelRefuerzo;
	}
	public void setNivelRefuerzo(int nivelRefuerzo) {
		this.nivelRefuerzo = nivelRefuerzo;
	}
	public Date getFechaUltRepaso() {
		return fechaUltRepaso;
	}
	public void setFechaUltRepaso(Date fechaUltRepaso) {
		this.fechaUltRepaso = fechaUltRepaso;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
