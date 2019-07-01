import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class client {
	public static void main(String[] args) throws IOException {	
		InetAddress addr = InetAddress.getByName("localhost");								//System.out.println("Indirizzo: "+addr);
		Socket clientSocket = new Socket(addr, server.getPort());							//System.out.println("Socket: "+clientSocket);
		
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		PrintWriter out = new PrintWriter(
							new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),		true);
		/////////////////INVIO//////////////////
		System.out.print("Primo numero: ");
		String num1 = tastiera.readLine();
		out.println(num1);
		System.out.print("Secondo numero: ");
		String num2 = tastiera.readLine();
		out.println(num2);
		
////////////////RICEZIONE/////////		
		String s = in.readLine();
		System.out.println("Somma = "+s);
		s = in.readLine();
		System.out.println("Prodotto = "+s);
		clientSocket.close();							//System.out.println("Closing...");

		}

	}

