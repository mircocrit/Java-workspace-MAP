

import java.net.MalformedURLException;
import java.rmi.*;

public class Client {
	public static void main(String[] args) throws RemoteException{
		System.out.println("Client");
		System.setSecurityManager(new SecurityManager());											//System.setProperty("java.security.policy", "C:\\Program Files\\Java\\jre1.8.0_211\\lib\\security\\java.policy");
		try {
			RettangoloI rett = (RettangoloI)Naming.lookup("//localhost:8080/rectang");
			rett.setbase(4);
			rett.setheight(5);
			rett.Area();
			
			//System.out.println(rett.Area());
			//System.out.println("----" + rett.getClass().getName());
		} 
		catch (MalformedURLException | NotBoundException e) 
		{
			e.printStackTrace();
		}

	}

}
