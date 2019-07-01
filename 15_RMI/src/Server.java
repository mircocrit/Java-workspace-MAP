import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	
	public static void main(String[] args)  throws RemoteException, MalformedURLException, AlreadyBoundException{	
		System.out.println("Server");						
		//Registry registry = LocateRegistry.createRegistry(8080);
		//System.setProperty("java.security.policy", "C:\\Program Files\\Java\\jre1.8.0_211\\lib\\security\\java.policy");
		System.setSecurityManager(new SecurityManager());
		Rettangolo rett1 = new Rettangolo();
		Naming.bind("hello", rett1);											//registry.rebind("//localhost:8080/rectang", rett1);
		System.out.println("Server in attesa ");
	}
}