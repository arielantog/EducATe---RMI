package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CursoDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ID = 1;
	private int id;
	private String descripcion;
	private List<AlumnoDTO> alumnos;
	private boolean activo;
	
	public CursoDTO(int id, String descripcion, boolean activo) {
		this.id = id;
		this.descripcion = descripcion;
		alumnos = new ArrayList<AlumnoDTO>();
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
	public List<AlumnoDTO> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<AlumnoDTO> alumnos) {
		this.alumnos = alumnos;
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
	
	public void agregarAlumnoDTO(AlumnoDTO alumnoDTO, boolean b) {
		alumnos.add(alumnoDTO);
	}
	
}
