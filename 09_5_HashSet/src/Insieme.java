
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class Insieme {
	HashSet<Studente> set = null;
	
	
	Insieme(){
		set= new HashSet<Studente>();
	}
	
	Insieme(HashSet<Studente> set){
		this.set= set;
	}
	
	void add(Studente s) {
		set.add(s);
	}
	
	boolean contains(Studente s) {
		return set.contains(s);
	}
	
	boolean remove(Studente s) {
		return set.remove(s);
	}
	int size() {
		return set.size();
	}
	boolean isEmpty() {
		return set.isEmpty();
	}
	protected Insieme clone(){
		return new Insieme(		(HashSet<Studente>)	 set.clone());
	}
	
	void print() {
		Iterator<Studente> e = set.iterator();
		while(e.hasNext())
			e.next().print();
		System.out.println("");
	}
	
	//ordinamento non presente
	public static void main(String[] args) {	
		Insieme i = new Insieme();
		
		Studente s1 = new Studente("676716","Ninny Sterlicchio", 22);
		Studente s2 = new Studente("676717","Lucia Scardigno",21);
		Studente s3 = new Studente("676718","Mirco Sipone",23);
		
		i.add(s1);
		i.add(s2);
		i.add(s3);
		//i.remove(s1);
		System.out.println(i.contains(s1));
		System.out.println(i.size());
		System.out.println(i.isEmpty());
		Insieme i2 = i.clone();

		i.print();
		i2.print();

	}
}
