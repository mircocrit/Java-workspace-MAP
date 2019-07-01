import java.util.ArrayList;
import java.util.Iterator;


public class List {
	private ArrayList<Studente> a;
	
	List() { a = new ArrayList<Studente>();}

	List(ArrayList<Studente> a){
		this.a= a;
	}
	public void add(Studente s) { a.add(s);}

	public void sortAble() { 
		System.out.println("Comparable");
		a.sort(null);}
	
	public void sortAtor() {
		System.out.println("Comparator");
		a.sort(new Studente());}
	
	@Override
	protected
	List clone() {
		return new List ( (ArrayList<Studente>) a.clone());
	}
	
	
	public void stampaList() {
		Iterator<Studente> e = a.iterator();
		System.out.println("");
		while(e.hasNext())
			e.next().print();
		System.out.println("");
	}
	
	public int counter(Studente s) {
		Iterator<Studente> e = a.iterator();
		int count=0;
		while(e.hasNext())
			if(e.next().equals(s))
				count++;;
		return count;
	}
	
	public static void main(String args[]){
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
		//a.sortAble();		//comparable
		a.sortAtor();		//comparator
		a.stampaList();
		List l2= a.clone();
		l2.stampaList();
		System.out.println(a.counter(s4));

	}
	
	
}
