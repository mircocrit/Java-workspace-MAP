import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class List {
	private ArrayList<Studente> a;
	
	List() { a = new ArrayList<Studente>();}
	List(ArrayList<Studente> a){	this.a= a;}

	public void add(Studente s) { a.add(s);}
	
	
	public int size() { return a.size();}
	public boolean isEmpty() {return a.isEmpty();}
	
	public void sortAble() { 
		System.out.println("Comparable");
		a.sort(null);}
	/*
	public void sortAtor() {
		System.out.println("Comparator");
		a.sort(new Studente());}
	*/
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
}
