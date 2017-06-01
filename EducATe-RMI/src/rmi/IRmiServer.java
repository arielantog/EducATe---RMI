package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRmiServer extends Remote {
	public static final String url = "localhost/rmi";

	public int nuevoAlumno(String tipoDocumento, int nroDocumento, String nombre, String apellido) throws RemoteException;
	
}