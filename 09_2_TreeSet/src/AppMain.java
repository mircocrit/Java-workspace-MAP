
public class AppMain {
	public static void main(String[] args) {	
		InsiemeOrdinato set = new InsiemeOrdinato();
		Studente s1 = new Studente(676716,"Ninny", "Sterlicchio");
		Studente s2 = new Studente(676717,"Lucia", "Scardigno");
		Studente s3 = new Studente(676720,"Mirco", "Sipone");
		Studente s4 = new Studente(676715,"Spreth", "Bahrn");
		Studente s5 = new Studente(676718,"Aned", "Bail");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		//set.remove(s1);
		
		System.out.println(set.contains(s1));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		set.print();

	}
}
