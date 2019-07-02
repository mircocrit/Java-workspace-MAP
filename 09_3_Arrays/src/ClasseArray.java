import java.util.*;

public class ClasseArray {
	private Studente[] studenti;
	
	ClasseArray(){	studenti= new Studente[5];}
	ClasseArray(Studente[] studenti){	this.studenti=studenti ;}
	
	void add(Studente s, int i){	studenti[i]=s;}
	
	void sortAble(){
		System.out.println("Comparable");
		Arrays.sort(studenti);	
	}
	/*
	void sortAtor(){
		System.out.println("Comparator");
		Arrays.sort(studenti, new Studente());
	}
	*/

	void print() {
		for(int i = 0; i < studenti.length; i++)
			System.out.println(studenti[i].getMatricola()+","+studenti[i].getNome()+","+studenti[i].getCognome());
		System.out.println("");
	}
	
	int binarySearch(Studente s) {	return Arrays.binarySearch(studenti,s);}
	
	ClasseArray copy() {
		Studente [] studenti2 = new Studente[studenti.length];
		System.arraycopy(studenti, 0, studenti2, 0, studenti.length);
		return new ClasseArray(	studenti2);
	}
	
	/*
	////////////////clone//////////////////////////
	for(int i = 0; i < studenti2.length; i++)
		studenti2[i] = (Studente)studenti1[i].clone();
	 */

}
