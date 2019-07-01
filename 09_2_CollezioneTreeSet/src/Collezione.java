import java.util.*;

public class Collezione {
	private TreeSet<Elemento> t;

	Collezione() { t= new TreeSet<Elemento>();};
	Collezione(TreeSet<Elemento> t) { this.t= t;};
	void add(Elemento e) { t.add(e);}

	@Override
	protected
	Collezione clone() {
		return new Collezione ( (TreeSet<Elemento>) t.clone());
	}
	//si ordina da solo
	
	void stampaCollezione() {		
		Iterator<Elemento> e = t.iterator();
		while(e.hasNext())
			System.out.println(e.next().getValue());
	}
	
	public static void main(String [] args) {
		Collezione c = new Collezione();
		c.add(	new Elemento("wqe", 12)	);
		c.add(	new Elemento("dqw",23)	);
		c.add(	new Elemento("qsfae",13)	);
		c.add(	new Elemento("ssfdqe",11)	);
		//si ordina da solo
		c.stampaCollezione();
	}
	
	
}
