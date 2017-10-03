package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.AlimentoDTO;
import dto.AlumnoDTO;
import dto.CursoDTO;
import dto.DocenteDTO;
import dto.TemaDTO;

public interface IRmiServer extends Remote {
	public static final String url = "localhost/rmi";

	public AlumnoDTO nuevoAlumno(String tipoDocumento, int nroDocumento, String nombre, String apellido, String usuario, String password, String mail) throws RemoteException;

	public DocenteDTO nuevoDocente(String tipoDocumento, int nroDocumento, String nombre, String apellido, String password, String mail) throws RemoteException;
	
	public DocenteDTO loginDocente(String tipoDocumento, int nroDocumento, String password) throws RemoteException;

	public AlumnoDTO loginAlumno(String usuario, String password)throws RemoteException;

	public int alumnoBuscarLeccion(int alumno, int juego) throws RemoteException;

	public void alumnoAgregarEnsenianza(int alumno, int leccion, boolean resultado) throws RemoteException;

	public int alumnoGetNivel(int alumno) throws RemoteException;

	public List<TemaDTO> listarTemas() throws RemoteException;
	
	public List<AlimentoDTO> listarAlimentos(int nroTipoAvatar) throws RemoteException;

	public AlumnoDTO traerPerfilAlumno(String usuario) throws RemoteException;

	public int modificarAlumno(String tipoDocumento, int nroDocumento, String nombre, String apellido,
			String password, String mail, String usuario) throws RemoteException;

	public int modificarDocente(String tipoDocumento, int nroDocumento, String nombre, String apellido, String mail,
			String password) throws RemoteException;

	public DocenteDTO traerPerfilDocente(String tipoDocumento, int nroDocumento) throws RemoteException;

	public List<CursoDTO> listarCursosPorDocente(int docente) throws RemoteException;

	public CursoDTO traerCursoDocente(int docente, int curso) throws RemoteException;

	public int elegirJuegoSinTema(int nroAlumno) throws RemoteException;

	public int elegirJuegoConTema(int nroAlumno, int nroTema) throws RemoteException;

	public AlumnoDTO alumnoEvolucionarAvatar(int nroAlumno) throws RemoteException;

	public AlumnoDTO alumnoRevivirAvatar(int nroAlumno) throws RemoteException;

	public AlumnoDTO buscarAlumnoAsignarCurso(String tipoDocumento, int nroDocumento) throws RemoteException;

	public CursoDTO cursoAgregarAlumno(int nroDocente, int nroCurso, int nroAlumno) throws RemoteException;

	public AlumnoDTO alumnoAlimentarAvatar(int nroAlumno, int nroAlimento) throws RemoteException;
	
	public CursoDTO docenteAgregarCurso(int nroCurso, String descripcion) throws RemoteException;

	
	
}