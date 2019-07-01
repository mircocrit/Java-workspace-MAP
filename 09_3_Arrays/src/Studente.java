//import java.util.Comparator;
import java.util.*;

//STUDENTE CLASSE CLONABILE CON COMPAARABLE	(COMPARATOR)
public class Studente implements Comparable<Studente>,Cloneable,Comparator<Studente>
{	
	protected String matricola;
	protected String NomeECognome;
	protected int eta;
	
	Studente(){
		setMatricola(null);
		setNomeECognome(null);
		eta = 0;		
	}
	Studente(String matricola, String NomeECognome, int eta){
		this.setMatricola(matricola);
		this.setNomeECognome(NomeECognome);
		this.setEta(eta);
	}

	public String getMatricola() {return matricola;}
	public String getNomeECognome() {return NomeECognome;}
	public int getEta(){	return eta;	}
	
	public void setMatricola(String matricola) {this.matricola = matricola;}
	public void setNomeECognome(String nomeECognome) {NomeECognome = nomeECognome;}
	public void setEta(int eta){this.eta = eta;}
	
	public void print(){System.out.println(matricola+", "+NomeECognome+", "+eta);}
	public void descrizione(){System.out.println("Studente");}
	///////////////////////////////////
	public Object clone(){
		Object o = null; 
		try {
			o = super.clone();
		} 
		catch (CloneNotSupportedException e) {e.printStackTrace();}
		return o;
	}
	////////////////////////////////////////

	@Override			//!!!
	public int compareTo(Studente o) { 
		System.out.println("Comparable");
		if(eta < o.eta)		return -1;													//NomeECognome.compareTo(o.getNomeECognome()) < 0)		
		else if(eta == o.eta)	return 0;												//NomeECognome.compareTo(o.getNomeECognome()) == 0)		
		else	return 1;		
	}	
	
	@Override
	public int compare(Studente o1, Studente o2) {		
		//System.out.println("Comparator");
		if(o1.getEta() < o2.getEta())
			return -1;
		else if(o1.getEta() == o2.getEta())
			return 0;
		else
			return 1;
	}
	public boolean equals(Object o) {
		Studente s = (Studente)o;
		return (this.matricola.compareTo(s.matricola) == 0);
		//return (this.matricola == s.getMatricola() && this.NomeECognome == s.getNomeECognome() && this.eta == s.getEta());
		
	}
}
