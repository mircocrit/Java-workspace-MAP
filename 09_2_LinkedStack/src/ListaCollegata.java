import java.util.Iterator;
import java.util.LinkedList;

public class ListaCollegata {
	private LinkedList<Studente> l;
	
	ListaCollegata(){l= new LinkedList<Studente>();};
	ListaCollegata(LinkedList<Studente> ll){this.l=ll;};
	
	public void add(Studente s) {	l.add(s);}

	public int size () { return l.size();}
	public boolean isEmpty() { return l.isEmpty();}
	
	public Studente elementAtIndex(int i) {return l.get(i);}
	
	public void sortAble() {l.sort(null);}
	//public void sortAtor() {ll.sort (new Studente());}
	
	public void print() {
		Iterator<Studente> e = l.iterator();
		System.out.println("");
		while(e.hasNext())
			e.next().print();
		System.out.println("");
	 }
	 
	 /*
		///////////////clone//////////////
		LinkedList<Studente> ll2 = new LinkedList<Studente>();
		ll2.add((Studente) s1.clone());
	*/
	}