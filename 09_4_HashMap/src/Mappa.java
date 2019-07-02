import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Mappa {
	private HashMap<String, Studente> hash;
		
	Mappa(){	hash= new HashMap<String, Studente>();}
	Mappa(HashMap<String, Studente> hashMap){	this.hash= hashMap;}
	
	void put(String str, Studente s) {	hash.put(str,s);}
	Studente get(String key) { return hash.get(key);}
	
	int size() {	return hash.size();}
	boolean isEmpty() {	return hash.isEmpty();}
	
	boolean containsKey(String key) {	return hash.containsKey(key);}
	void remove(String s) {	hash.remove(s);}
	
	@Override
	protected Mappa clone(){
		return new Mappa((HashMap < String, Studente >) hash.clone());
	}


	void print() {
		System.out.println("");
		Iterator e= hash.entrySet().iterator();				//Iterator<  HashMap.Entry<String, Studente>  > e = hash.entrySet().iterator();
		while(e.hasNext()){
			Map.Entry entry = (Map.Entry)	e.next();
			System.out.print(entry.getKey() + "  ");

		    ((Studente) entry.getValue()).print();
		}
		System.out.println("");
	}
	
	
	

	
	
}
