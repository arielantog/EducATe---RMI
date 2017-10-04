package dto;

public class ErrorDTO {
	private int codigo;
	private String mensaje;

	/*** CODIGOS DE ERROR ***
	 * 1 - Se intenta registrar un Alumno ya cargado
	 * 2 - Se intenta registrar un Docente ya cargado
	 * 3 - Se intenta alimentar el avatar cuando no tiene los puntos necesarios/no tiene hambre/esta muerto
	 * 4 - Se intenta evolucionar el avatar cuando esta muerto/no tiene la vida suficiente/no tiene los puntos suficientes
	 * 5 - Se intenta revivir el avatar cuando lo tiene los puntos necesarios
	 * 6 - 
	 */
	
	
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
