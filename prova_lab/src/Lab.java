import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class Lab {
	public static void main(String [] args) throws NumberFormatException, IOException, ClassNotFoundException {
		//1. inserimento dati studente (PROVA BASE)
		Studente studente = inserimento();
		System.out.println("Fine inserimento");
		
		//a. serializzazione
		String nomeFile="C:\\Users\\Mirco\\git\\Java-workspace-MAP\\prova_lab\\src\\prova.txt";
		serializzazione(studente,nomeFile);
		studente=null;
		System.out.println("Contenuto variabile studente: " + studente);
		System.out.println("fine serializzazione");
		
		//b. deserializzazione
		studente = deserializzazione(nomeFile);
		System.out.println("fine deserializzazione");
		
		//2. stampa studente (PROVA BASE)
		studente.print();
		System.out.println("Fine programma");
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
	
	public static void serializzazione(Studente stud, String nomeFile) throws IOException {
		FileOutputStream f = new FileOutputStream(nomeFile);
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(stud);
		o.close();
		}

	public static Studente deserializzazione(String nomeFile) throws IOException, ClassNotFoundException {
		Studente stud= new Studente();
		FileInputStream f = new FileInputStream(nomeFile);
		ObjectInputStream o = new ObjectInputStream(f);
		stud = (Studente) o.readObject();
		o.close();
		return stud;
	}
}
