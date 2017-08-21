package dto;

import java.io.Serializable;

public class AlimentoDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ID = 1;
	private int id;
	private String nombre;
	private int proteinas;
	private int precio;
	private boolean activo;
	private String url;
	
	public AlimentoDTO(int id, String nombre, int proteinas, int precio, boolean activo, String url) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.proteinas = proteinas;
		this.precio = precio;
		this.activo = activo;
		this.setUrl(url);
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProteinas() {
		return proteinas;
	}

	public void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
