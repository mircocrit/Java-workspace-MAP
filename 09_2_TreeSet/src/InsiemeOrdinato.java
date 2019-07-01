import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;



public class InsiemeOrdinato {
	TreeSet<Studente> treeSet = null;
	
	InsiemeOrdinato(){
		treeSet= new TreeSet<Studente>();
	}
	
	public InsiemeOrdinato(TreeSet<Studente> tree) {
		treeSet= tree;
	}

	void add(Studente s) {
		treeSet.add(s);
	}
	// gia ordinato
	boolean contains(Studente s) {
		return treeSet.contains(s);
	}
	
	boolean remove(Studente s) {
		return treeSet.remove(s);
	}
	int size() {
		return treeSet.size();
	}
	boolean isEmpty() {
		return treeSet.isEmpty();
	}
	protected InsiemeOrdinato clone(){
		return new InsiemeOrdinato(		(TreeSet<Studente>)	 treeSet.clone());
	}
	
	void print() {
		Iterator<Studente> e = treeSet.iterator();
		while(e.hasNext())
			e.next().print();
		System.out.println("");
	}
	
	
	
	public static void main(String[] args) {	
		InsiemeOrdinato i = new InsiemeOrdinato();
		Studente s1 = new Studente("676716","Ninny Sterlicchio", 22);
		Studente s2 = new Studente("676717","Lucia Scardigno",21);
		Studente s3 = new Studente("676718","Mirco Sipone",23);
		
		//Per ordinare lavora con compareTo di Comparable
		i.add(s1);
		i.add(s2);
		i.add(s3);
		i.remove(s1);
		System.out.println(i.contains(s1));
		System.out.println(i.size());
		System.out.println(i.isEmpty());
		i.print();

	}
}
