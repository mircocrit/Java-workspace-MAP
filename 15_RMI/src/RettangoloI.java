import java.rmi.*;

public interface RettangoloI extends Remote {
	public void Area()				 throws RemoteException;
	public long getbase() 			throws RemoteException;
	public long getheight()			throws RemoteException;
	public void setbase(int a) 		throws RemoteException;
	public void setheight(int b)	throws RemoteException;
}
