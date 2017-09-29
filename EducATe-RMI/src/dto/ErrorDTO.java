package dto;

public class ErrorDTO {
	private int codigo;
	private String mensaje;

	public ErrorDTO(int codigo, String mensaje) {
		this.codigo = codigo;
		this.mensaje = mensaje;
	}
	
	public ErrorDTO(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}




}
