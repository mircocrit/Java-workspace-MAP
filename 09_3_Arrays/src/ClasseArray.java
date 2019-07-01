import java.util.*;

public class ClasseArray {
	private Studente[] studenti;
	
	ClasseArray(){
		studenti= new Studente[5];
	}
	ClasseArray(Studente[] studenti){
		this.studenti=studenti ;
	}
	
	void add(Studente s, int i){
		studenti[i]=s;
	}
	void sortAtor(){
		System.out.println("Comparator");
		Arrays.sort(studenti, new Studente());
	}
	
	void sortAble(){
		System.out.println("Comparable");
		Arrays.sort(studenti);	
		;
	}
	void stampa() {
		for(int i = 0; i < studenti.length; i++)
			System.out.println(studenti[i].getMatricola()+","+studenti[i].getNomeECognome()+","+studenti[i].getEta());
		System.out.println("");
	}
	
	int binarySearch(Studente s) {
		return Arrays.binarySearch(studenti,s);
	}
	
	ClasseArray copy() {
		Studente [] studenti2 = new Studente[studenti.length];
		System.arraycopy(studenti, 0, studenti2, 0, studenti.length);
		return new ClasseArray(	studenti2);
	}
	
	/**
	 * 	////////////////clone//////////////////////////
	for(int i = 0; i < studenti2.length; i++)
		studenti2[i] = (Studente)studenti1[i].clone();
	 * @param args
	 */
	public static void main(String[] args) {
		ClasseArray arr = new ClasseArray();
		Studente s1= new Studente("676716","Ninny Sterlicchio", 22);
		arr.add(s1,3);
		Studente s2= new Studente("676717","Lucia Scardigno",21);
		arr.add(s2,2);
		Studente s3= new Studente("676718", "Raffa Scar", 21);
		arr.add(s3,4);
		Studente s4= new Studente("676719", "Mirco Sipone", 23);
		arr.add(s4,1);
		Studente s5= new Studente("676720", "Cristian Miccolis", 22);
		arr.add(s5,0);
		arr.stampa();
		arr.sortAble();		//comparable
		//arr.sortAtor();	//comparator
		arr.stampa();
		Studente s = new Studente("676720","Cristian Miccolis",22);
		System.out.println(arr.binarySearch(s));
	}
}
