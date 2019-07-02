
public class AppMain {
	public static void main(String [] args) {
		Collezione c = new Collezione();
		c.add(	new Elemento("alfa", 12)	);
		c.add(	new Elemento("gamma",23)	);
		c.add(	new Elemento("beta",13)	);
		c.add(	new Elemento("delta",11)	);
		//si ordina da solo
		c.print();
	}
}
