

public class AppMain{
	public static void main(String[] args) {	
			Studente s1 = new Studente("Ninny","Sterlicchio", 22);
			Studente s2 = new Studente("Lucia","Scardigno",21);
			Studente s3 = new Studente("Mirco","Sipone",23);
			Studente s4 = new Studente("Luca","Povia",34);
			Studente s5 = new Studente("Karol","Wojtila",93);
			Studente s6 = new Studente("Super","Santos",24);
			Studente s7 = new Studente("Primo","Levi",125);
			
			Mappa map = new Mappa();
			map.put("676716",s1);
			map.put("676714",s2);
			map.put("676719",s3);
			map.put("676715",s4);
			map.put("676713",s5);
			map.put("676717",s6);
			map.put("676718",s7);
			
			map.print();
			
			//map.remove("676716");
			if(map.containsKey("676716"))	map.get("676716").print();
			else System.out.println("no");
			
			
			Mappa map2= map.clone();
			//map2.print();
		}
}