
public class AppMain {
	public static void main(String[] args) {	
		Insieme i = new Insieme();
		
		Studente s1= new Studente(676714,"Ninny", "Sterlicchio");
		Studente s2= new Studente(676712,"Lucia", "Scardigno");
		Studente s3= new Studente(676711, "Raffa", "Scaringi");
		Studente s4= new Studente(676719, "Mirco", "Sipone");
		Studente s5= new Studente(676713, "Cristian", "Miccolis");
		
		i.add(s1);
		i.add(s2);
		i.add(s3);
		i.add(s4);
		i.add(s5);
		
		i.print();
		
		//i.remove(s1);
		System.out.println(i.contains(s1));
		System.out.println(i.size());
		System.out.println(i.isEmpty());


		Insieme i2 = i.clone();
		i2.print();

	}
}
