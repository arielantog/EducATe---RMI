package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TipoAvatarDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ID = 1;
	private int id;
	private String nombre;
	private int alimentoMax;
	private int tiempoHambre;
	private int precioEvolucion;
	private int precioRevivir;
	private List<AlimentoDTO> alimentos;
	private boolean activo;
	private String url;
	
	public TipoAvatarDTO(int id, String nombre, int alimentoMax, int tiempoHambre, int precioEvolucion,
			int precioRevivir, boolean activo, String url) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.alimentoMax = alimentoMax;
		this.tiempoHambre = tiempoHambre;
		this.precioEvolucion = precioEvolucion;
		this.precioRevivir = precioRevivir;
		this.alimentos = new ArrayList<AlimentoDTO>();
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
	public int getAlimentoMax() {
		return alimentoMax;
	}
	public void setAlimentoMax(int alimentoMax) {
		this.alimentoMax = alimentoMax;
	}
	public int getTiempoHambre() {
		return tiempoHambre;
	}
	public void setTiempoHambre(int tiempoHambre) {
		this.tiempoHambre = tiempoHambre;
	}
	public int getPrecioEvolucion() {
		return precioEvolucion;
	}
	public void setPrecioEvolucion(int precioEvolucion) {
		this.precioEvolucion = precioEvolucion;
	}
	public int getPrecioRevivir() {
		return precioRevivir;
	}
	public void setPrecioRevivir(int precioRevivir) {
		this.precioRevivir = precioRevivir;
	}
	public List<AlimentoDTO> getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(List<AlimentoDTO> alimentos) {
		this.alimentos = alimentos;
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
	public void agregarAlimento(AlimentoDTO alimentoDTO) {
		alimentos.add(alimentoDTO);	
	}
}
