import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Albero {
	private TreeMap<String, Studente> treeMap;
	//public static void descrizioneStudente(Studente s){	s.descrizione();}
	//public static Studente getStudente(Studente s){return s;}
	
	Albero(){
		treeMap= new TreeMap<String, Studente>();
	}
	Albero(TreeMap<String, Studente> treeMap){
		this.treeMap= treeMap;
	}		
	
	void put(String str, Studente s) {
		this.treeMap.put(str,s);
	}
	
	int size() {
		return treeMap.size();
	}
	boolean isEmpty() {
		return treeMap.isEmpty();
	}
	
	boolean containsK(String key) {
		return treeMap.containsKey(key);
		
	}
	@Override
	protected
	Albero clone(){
		//(HashMap<String, Studente>) ;
		return new Albero((TreeMap<String, Studente>)treeMap.clone());
	}
	
	void sort() {
		//treeMap2.sort(null);
		//treeMap2.sort(new StudenteElementare());
	}
	
	void printTree() {
		Iterator e1 = treeMap.entrySet().iterator();
		//System.out.println("Stampa treeMap");
		while(e1.hasNext()){
			Map.Entry me = (Map.Entry)	e1.next();
			
			System.out.print("Key is: "+me.getKey() + "		&		");
		    System.out.println("Value is: "+ ((Studente) me.getValue()).getNomeECognome());
		}
		System.out.println("");
	}
	public static void main(String[] args) {	
		Albero a = new Albero();
		
		Studente s1= new Studente("Ninny Sterl",22);
		Studente s2= new Studente("Cristian Miccolis", 18);
		Studente s3= new Studente("Angela Sterl",21);
		
		a.put("676716",s1);
		a.put("676720",s2);
		a.put("676718",s3);

		/////prove stampa/////
		System.out.println(a.containsK("676718"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		///////////////clone//////////////
		Albero a2 = a.clone();
		a2.printTree();
		a.printTree();

		
		
		a2.sort();										//se come argometto si mette null viene utilizzato Comparale
	}
}
