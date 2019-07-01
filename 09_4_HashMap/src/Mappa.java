import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;



public class Mappa {
	private HashMap<String, Studente> hashMap;
		
	Mappa(){
		hashMap= new HashMap<String, Studente>();
	}
	Mappa(HashMap<String, Studente> hashMap){
		this.hashMap= hashMap;
	}
	
	void put(String str, Studente s) {
		hashMap.put(str,s);
	}
	
	int size() {
		return hashMap.size();
	}
	
	boolean isEmpty() {
		return hashMap.isEmpty();
	}
	
	boolean containsK(String key) {
		return hashMap.containsKey(key);
	}
	@Override
	protected
	Mappa clone(){
		//(HashMap<String, Studente>) ;
		return new Mappa((HashMap<String, Studente>)hashMap.clone());
	}
	
	Studente getter(String key) {
		return hashMap.get(key);
	}
	void printMap() {
		System.out.println(hashMap.keySet());
		System.out.println("");
		Iterator<  HashMap.Entry<String, Studente>  > e = hashMap.entrySet().iterator();
		while(e.hasNext()){
			Studente temp = e.next().getValue();
			temp.print();
		
		}
		System.out.println("");
	}
	void sort() {}
	void remove(String s) {
			hashMap.remove(s);
	}

	
	public static void main(String[] args) {	
		Studente s1 = new Studente("Ninny Sterlicchio", 22);
		Studente s2 = new Studente("Lucia Scardigno",21);
		Studente s3 = new Studente("Mirco Sipone",23);
		Mappa map1 = new Mappa();
		map1.put("676716", s1);
		map1.put("676718",s2);
		map1.put("676719",s3);
		map1.containsK("676716");
		/////prove stampa/////
		map1.getter("676716").print();
		
		Mappa map2= map1.clone();
		map1.remove("676716");
		map1.printMap();
		//map1.sort();
		
		///////////////clone//////////////
		//HashMap<String,Studente> hashMap2 = new HashMap<String,Studente>();
		//hashMap2.put(new String("676716"),(Studente) s1.clone());
		//hashMap2.put(new String("675716"),(Studente) s2.clone());
		
		map2.printMap();
		

		
	}
}
