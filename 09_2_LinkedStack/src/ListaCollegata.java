import java.util.Iterator;
import java.util.LinkedList;

public class ListaCollegata {
	private LinkedList<Studente> ll;
	
	ListaCollegata(){ll= new LinkedList<Studente>();};
	ListaCollegata(LinkedList<Studente> ll){this.ll=ll;};
	
	public void add(Studente s) {	ll.add(s);}

	public int size () { return ll.size();}
	public boolean isEmpty() { return ll.isEmpty();}
	
	public Studente elementAtIndex(int i) {return ll.get(i);}
	
	public void sortAble() {ll.sort(null);}
	//public void sortAtor() {ll.sort (new Studente());}
	
	public void print() {
		Iterator<Studente> e = ll.iterator();
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