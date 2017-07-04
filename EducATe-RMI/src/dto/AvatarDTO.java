package dto;

import java.io.Serializable;
import java.util.Date;

public class AvatarDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ID = 1;
	private int id;
	private int hambre;
	private Date ultimaComida;
	private TipoAvatarDTO tipoAvatar;
	
	public AvatarDTO(int id, int hambre, Date ultimaComida) {
		super();
		this.id = id;
		this.hambre = hambre;
		this.ultimaComida = ultimaComida;
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
	public int getHambre() {
		return hambre;
	}
	public void setHambre(int hambre) {
		this.hambre = hambre;
	}
	public Date getUltimaComida() {
		return ultimaComida;
	}
	public void setUltimaComida(Date ultimaComida) {
		this.ultimaComida = ultimaComida;
	}
	public TipoAvatarDTO getTipoAvatar() {
		return tipoAvatar;
	}
	public void setTipoAvatarDTO(TipoAvatarDTO tipoAvatar) {
		this.tipoAvatar = tipoAvatar;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
