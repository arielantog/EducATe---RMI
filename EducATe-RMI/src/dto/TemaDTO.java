package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TemaDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ID = 1;
	private int id;
	private String descripcion;
	private List<LeccionDTO> lecciones;
	private boolean activo;
	
	public TemaDTO(int id, String descripcion, boolean activo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		lecciones = new ArrayList<LeccionDTO>();
		this.activo = activo;
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<LeccionDTO> getLecciones() {
		return lecciones;
	}

	public void setLecciones(List<LeccionDTO> lecciones) {
		this.lecciones = lecciones;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
