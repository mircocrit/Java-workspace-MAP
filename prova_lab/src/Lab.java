import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class Lab {
	public static void main(String [] args) throws NumberFormatException, IOException {
		Studente studente = inserimento();
		System.out.println("Fine inserimento\n");
		
		studente.print();
	}
	 
	
	public static Studente inserimento() throws NumberFormatException, IOException{
		Studente s = new Studente();
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("matricola: ");
		s.setMatricola(Integer.parseInt(r.readLine()));
		System.out.println("nome: ");
		s.setNome(r.readLine());
		System.out.println("cognome: ");
		s.setCognome(r.readLine());
		
		s.setList();
		return s;
		}
	
	public static void serializzazione(Studente s, String str) throws IOException {
		FileOutputStream f = new FileOutputStream(str);
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(s);
		o.close();
		}
	}
