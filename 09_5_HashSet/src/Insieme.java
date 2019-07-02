
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class Insieme {
	HashSet<Studente> set = null;

	Insieme(){		set= new HashSet<Studente>();}
	Insieme(HashSet<Studente> set){	this.set= set;}
	
	void add(Studente s) {			set.add(s);}
	boolean contains(Studente s) {	return set.contains(s);}
	boolean remove(Studente s) {	return set.remove(s);}
	int size() {			return set.size();}
	boolean isEmpty() {		return set.isEmpty();}
	
	protected Insieme clone(){
		return new Insieme(	(HashSet<Studente>)	 set.clone());
	}
	
	//ordinamento non presente
	
	void print() {
		Iterator<Studente> e = set.iterator();
		while(e.hasNext())
			e.next().print();
		System.out.println("");
	}
	
	
	
	
	
}
