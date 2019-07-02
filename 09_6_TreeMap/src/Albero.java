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
	private TreeMap< String, Studente > tree;
	
	Albero(){	tree= new TreeMap<String, Studente>();}
	Albero(TreeMap<String, Studente> treeMap){	this.tree= treeMap;}		
	
	void put(String str, Studente s) {	this.tree.put(str,s);}
	
	int size() {		return tree.size();}
	boolean isEmpty() {	return tree.isEmpty();}
	boolean containsKey(String key) {	return tree.containsKey(key);}
	
	@Override
	protected Albero clone(){
		return new Albero(( TreeMap  <String, Studente> )tree.clone());
	}
	
	void print() {
		Iterator e = tree.entrySet().iterator();
		System.out.println("");
		while(e.hasNext()){
			Map.Entry entry = (Map.Entry)	e.next();
			System.out.print(entry.getKey() + "  ");

		    //System.out.println("Value : ");
		    ((Studente) entry.getValue()).print();
		}
		System.out.println("");
	}
	
}
