import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	private static final int PORT = 8080;
		
	public static final int getPort(){return PORT;}
	private static int somma(int x, int y){return x + y;}
	private static int prodotto(int x, int y){return x * y;}
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(PORT);		//System.out.println("Started = "+server);
		Socket socket = server.accept();			//System.out.println("Connessione accettata: "+socket);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
		
		while(true){
			//////////////RICEZIONE//////////////////
			String num1 = in.readLine();
			int _num1 = Integer.parseInt(num1);
			String num2 = in.readLine();
			int _num2 = Integer.parseInt(num2);
			
			//////////////INVIO//////////////////
			out.println(Integer.toString(somma(_num1,_num2)));
			out.println(Integer.toString(prodotto(_num1,_num2)));
			break;
		}
		socket.close();
		System.out.println("Closing server...");
		server.close();
	}
	
	
}
