package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DocenteDTO extends PersonaDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ID = 1;
	private int id;
	private List<CursoDTO> cursos;
	private boolean activo;
	
	public DocenteDTO(int id, String tipoDocumento, int nroDocumento, String nombre, String apellido, String password,
			String mail, boolean activo) {
		super(tipoDocumento, nroDocumento, nombre, apellido, password, mail);
		this.id = id;
		this.activo = activo;
		cursos = new ArrayList<CursoDTO>();
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
	public List<CursoDTO> getCursos() {
		return cursos;
	}
	public void setCursos(List<CursoDTO> cursos) {
		this.cursos = cursos;
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
	public void agregarCurso(CursoDTO curso) {
		cursos.add(curso);
	}

}
