
public class AppMain {
	public static void main(String[] args) {	
		Albero a = new Albero();
		
		Studente s1= new Studente("Ninny", "Sterlicchio",22);
		Studente s2= new Studente("Lucia", "Scardigno",21);
		Studente s3= new Studente("Raffa", "Scaringi",20);
		Studente s4= new Studente("Mirco", "Sipone",23);
		Studente s5= new Studente("Cristian", "Miccolis",19);
		
		a.put("676716",s1);
		a.put("676720",s2);
		a.put("676718",s3);
		a.put("676717",s4);
		a.put("676729",s5);
		a.print();
		
		System.out.println(a.containsKey("676718"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		Albero a2 = a.clone();
		a2.print();
	}
}
