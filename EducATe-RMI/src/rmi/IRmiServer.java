package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dto.AlumnoDTO;
import dto.DocenteDTO;

public interface IRmiServer extends Remote {
	public static final String url = "localhost/rmi";

	public int nuevoAlumno(String tipoDocumento, int nroDocumento, String nombre, String apellido, String usuario, String password, String mail) throws RemoteException;

	public int nuevoDocente(String tipoDocumento, int nroDocumento, String nombre, String apellido, String password, String mail) throws RemoteException;

	//public int loginDocente(String tipoDocumento, int nroDocumento, String password) throws RemoteException;

	//public DocenteDTO loginDocente(int idDocente) throws RemoteException;
	
	public DocenteDTO loginDocente(String tipoDocumento, int nroDocumento, String password) throws RemoteException;

	public AlumnoDTO loginAlumno(String usuario, String password)throws RemoteException;
	
}