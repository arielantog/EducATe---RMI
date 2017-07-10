package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDTO extends PersonaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private static int ID = 1;
	private static final int PuntosRespuestaCorrecta = 100;
	private static final int PuntosRespuestaIncorrecta = 20;
	private int id;
	private int puntos;
	private List<EnsenianzaDTO> ensenianzas;
	private AvatarDTO avatar;
	private boolean activo;
	private String usuario;

	public AlumnoDTO(int id,String tipoDocumento, int nroDocumento, String nombre, String apellido, String usuario, String password, String mail, int puntos, boolean activo) {
		super(tipoDocumento, nroDocumento, nombre, apellido, password, mail);
		this.id = id;
		this.puntos = puntos;
		this.activo = activo;
		this.usuario = usuario;
		ensenianzas = new ArrayList<EnsenianzaDTO>();
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

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public List<EnsenianzaDTO> getEnsenianzas() {
		return ensenianzas;
	}

	public void setEnsenianzas(List<EnsenianzaDTO> ensenianzas) {
		this.ensenianzas = ensenianzas;
	}

	public AvatarDTO getAvatar() {
		return avatar;
	}

	public void setAvatar(AvatarDTO avatar) {
		this.avatar = avatar;
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

	public static int getPuntosrespuestacorrecta() {
		return PuntosRespuestaCorrecta;
	}

	public static int getPuntosrespuestaincorrecta() {
		return PuntosRespuestaIncorrecta;
	}

	public void agregarEnsenianzaDTO(EnsenianzaDTO ensenianzaDTO) {
		ensenianzas.add(ensenianzaDTO);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
