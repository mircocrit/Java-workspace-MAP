
public class AppMain {
	public static void main(String[] args) {
		ClasseArray arr = new ClasseArray();
		Studente s1= new Studente(676716,"Ninny", "Sterlicchio");
		Studente s2= new Studente(676717,"Lucia", "Scardigno");
		Studente s3= new Studente(676718, "Raffa", "Scaringi");
		Studente s4= new Studente(676719, "Mirco", "Sipone");
		Studente s5= new Studente(676720, "Cristian", "Miccolis");
		
		arr.add(s1,3);
		arr.add(s2,2);
		arr.add(s3,4);
		arr.add(s4,1);
		arr.add(s5,0);

		arr.print();
		
		arr.sortAble();		//comparable
		//arr.sortAtor();	//comparator
		arr.print();
		
		Studente s = new Studente(676720,"Cristian", "Miccolis");
		System.out.println(arr.binarySearch(s));
	}
}
