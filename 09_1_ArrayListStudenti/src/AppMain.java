import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppMain {
	public static void main(String args[]) throws IOException{
		Studente s1 = new Studente(676716,"Ninny", "Sterlicchio");
		Studente s2 = new Studente(676717,"Lucia", "Scardigno");
		Studente s3 = new Studente(676718,"Mirco", "Sipone");
		Studente s4 = new Studente(676718,"Mirco", "Vittoriano");
		Studente s5 = new Studente(676718,"Mirco", "Sipone");

		List a = new List();
		a.add(s5);
		a.add(s1);
		a.add(s2);
		a.add(s4);
		a.add(s3);
		
		a.stampaList();
		a.sortAble();		//comparable
		//a.sortAtor();		//comparator
		a.stampaList();
		
		List l2= a.clone();
		l2.stampaList();
		
		System.out.println(a.counter(s4));

	}
}
