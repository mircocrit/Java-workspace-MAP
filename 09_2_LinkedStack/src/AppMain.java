import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class AppMain {
	public static void descrizioneStudente(Studente s){	s.descrizione();}
	public static Studente getStudente(Studente s){return s;}
	
	public static void main(String[] args) {	
		Studente s1 = new Studente("676716","Ninny Sterlicchio", 22);
		Studente s2 = new Studente("676717","Lucia Scardigno",21);
		Studente s3 = new Studente("676718","Mirco Sipone",23);
		
		LinkedList<Studente> ll = new LinkedList<Studente>();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		ll.sort(new Studente());

		/////prove stampa/////
		System.out.println(ll.get(2).getNomeECognome());
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		
		///////////////clone//////////////
		LinkedList<Studente> ll2 = new LinkedList<Studente>();
		ll2.add((Studente) s1.clone());
		ll2.add((Studente) s2.clone());
		//ll2.sort(null);
		//ll2.sort(new Studente());
		
		//s.sort(new Studente());										//se come argometto si mette null viene utilizzato Comparale
		//System.out.println("Prima di itetator "+s.get(0).getNomeECognome());
		
		
		//////////STAMPA ARRAYLIST 1////////////////
		Iterator<Studente> e = ll.iterator();
		System.out.println("\nStampa LinkedList 1");
		while(e.hasNext())
			e.next().print();
		
		//////////STAMPA ARRAYLIST 2////////////////
		Iterator<Studente> e2 = ll2.iterator();
		System.out.println("\nStampa LinkedList 2");
		while(e2.hasNext())
			e2.next().print();
		//..
	}
}
