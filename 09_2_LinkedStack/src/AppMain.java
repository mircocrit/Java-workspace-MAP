import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class AppMain {
	
	public static void main(String[] args) {	
		Studente s1 = new Studente(676714,"Ninny","Sterlicchio");
		Studente s2 = new Studente(676712,"Lucia","Scardigno");
		Studente s3 = new Studente(676713,"Mirco","Sipone");
		Studente s4 = new Studente(676716, "Raffa", "Scaringi");
		Studente s5 = new Studente(676711, "Mirco", "Spione");
		Studente s6 = new Studente(676715, "Cristian", "Miccolis");
		
		ListaCollegata ll = new ListaCollegata();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		ll.add(s4);
		ll.add(s5);
		ll.add(s6);

		ll.print();
		ll.sortAble();		//comparable
		//ll.sortAtor();		//comparator
		ll.print();
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		//ListaCollegata l2= ll.clone();
		//l2.print();
	}
}