import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class InsiemeOrdinato {
	TreeSet<Studente> treeSet = null;
	
	InsiemeOrdinato(){ treeSet= new TreeSet<Studente>();}	
	public InsiemeOrdinato(TreeSet<Studente> tree) {	treeSet= tree;}

	void add(Studente s) {  treeSet.add(s);}

	boolean contains(Studente s) {	return treeSet.contains(s);}
	boolean remove(Studente s) {	return treeSet.remove(s);}
	
	int size() { 					return treeSet.size();}
	boolean isEmpty() {				return treeSet.isEmpty();}
	
	protected InsiemeOrdinato clone(){
		return new InsiemeOrdinato(		(TreeSet<Studente>)	 treeSet.clone());
	}
	
	// gia ordinato
	
	void print() {
		Iterator<Studente> e = treeSet.iterator();
		while(e.hasNext())
			e.next().print();
		System.out.println("");
	}
}
