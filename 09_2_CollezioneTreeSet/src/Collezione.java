import java.util.*;

public class Collezione {
	private TreeSet<Elemento> t;

	Collezione() { t= new TreeSet<Elemento>();};
	Collezione(TreeSet<Elemento> t) { this.t= t;};
	
	void add(Elemento e) { t.add(e);}

	@Override
	protected Collezione clone() {
		return new Collezione ( (TreeSet<Elemento>) t.clone());
	}
	//si ordina da solo
	
	void print() {	
		Iterator<Elemento> e = t.iterator();
		while(e.hasNext())
			e.next().print();
	}
}
