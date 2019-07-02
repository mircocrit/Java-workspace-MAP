import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AppMain {


	public static Studente getStudente(Studente s){return s;}
	public static void main(String[] args) {	
	
		Studente s = new Studente();
		Studente s2 = new Studente("676716","Ninny Sterl",22);
		StudenteElementare se = new StudenteElementare("676716","Ninny Sterl",22,"Prima Elementare");
		se.descrizione();
		System.out.println(se.getNomeECognome()+","+se.getClasseElementare());
		
		Studente s1 = new StudenteElementare("676717","Lucia Scardigno",21,"Seconda elementare");
		s1.descrizione();
		System.out.println(s1.getNomeECognome()+","+((StudenteElementare) s1).getClasseElementare());
		
		AppMain.descrizioneStudente(s);
		System.out.println("Studente s1 = "+AppMain.getStudente(s1).getNomeECognome());
		System.out.println(s.equals(s2));

		/*
		Studente s1 = new Studente("676716","Ninny Sterlicchio", 22);
		Studente s2 = (Studente)s1.clone();
		s1.setEta(23);
		System.out.println(s1.getMatricola()+","+s1.getNomeECognome()+","+s1.getEta());
		System.out.println(s2.getMatricola()+","+s2.getNomeECognome()+","+s2.getEta());
		
		System.out.println(s1.equals(s2));
		*/

	}
}
