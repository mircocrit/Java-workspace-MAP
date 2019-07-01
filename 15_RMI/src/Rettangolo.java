
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Rettangolo extends UnicastRemoteObject implements RettangoloI {
	private int a;
	private int b;
	
	private static final long serialVersionUID = 1L;

	Rettangolo() 	throws RemoteException{super();this.a=0;this.b=0;};
	
	
	public void setbase(int a)	 	throws RemoteException		{this.a= a;}
	public void setheight(int b) 	throws RemoteException		{this.b= b;}
	public long getbase()	 	throws RemoteException		{return a;}
	public long getheight() 	throws RemoteException		{return b;}
	
	public void Area() 			throws RemoteException		{System.out.println(a*b);}

	
}
