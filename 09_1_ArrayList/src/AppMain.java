
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class AppMain {
	public static void descrizioneStudente(Studente s){	s.descrizione();}
	public static Studente getStudente(Studente s){return s;}
	
	public static void main(String[] args) {	
		Studente s1 = new Studente("676716","Ninny Sterlicchio", 22);
		Studente s2 = new Studente("676717","Lucia Scardigno",21);
		Studente s3 = new Studente("676718","Mirco Sipone",23);
		
		ArrayList<Studente> a = new ArrayList<Studente>();
		a.add(s3);
		a.add(s1);
		a.add(s2);

		/////prove stampa/////
		System.out.println(a.get(2).getNomeECognome());
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		///////////////clone//////////////
		ArrayList<Studente> a2 = new ArrayList<Studente>();
		a2.add((Studente) s1.clone());
		a2.add((Studente) s2.clone());
		a2.sort(null);
		System.out.println("");

		//////////STAMPA ARRAYLIST 1////////////////
		Iterator<Studente> e = a.iterator();
		System.out.println("Stampa arrayList 1");
		while(e.hasNext())
			e.next().print();
		System.out.println("");
		
		//////////STAMPA ARRAYLIST 2////////////////
		Iterator<Studente> e2 = a2.iterator();
		System.out.println("Stampa arrayList 2");
		while(e2.hasNext())
			e2.next().print();
	}
}
