import java.util.Comparator;
import java.util.*;

//STUDENTE CLASSE CLONABILE CON COMPARATOR
public class Studente implements Comparable<Studente>,Cloneable,Comparator<Studente>{		
	protected String NomeECognome;
	protected int eta;
	
	Studente(){
		setNomeECognome(null);
		eta = 0;	
	}
	Studente( String NomeECognome, int eta){
		this.setNomeECognome(NomeECognome);
		this.setEta(eta);
	}

	public String getNomeECognome() {return NomeECognome;}
	public int getEta(){	return eta;	}
	

	public void setNomeECognome(String nomeECognome) {NomeECognome = nomeECognome;}
	public void setEta(int eta){this.eta = eta;}
	
	public void print(){System.out.println(NomeECognome+", "+eta);}
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

	
	
	
	
	 @Override		
	public int compareTo(Studente o) { 
		if(eta < o.eta)		return -1;													//NomeECognome.compareTo(o.getNomeECognome()) < 0)		
		else if(eta == o.eta)	return 0;												//NomeECognome.compareTo(o.getNomeECognome()) == 0)		
		else	return 1;		
	}	
	 
	 public boolean equals(Object o) {
		Studente s = (Studente)o;
		//return (this.matricola.compareTo(s.matricola) == 0);
		return (this.NomeECognome == s.NomeECognome);	
		}
	 
	////////////////////////////////////////
	@Override
	public int compare(Studente o1, Studente o2) {	
	if(o1.eta < o2.eta)		return -1;													//NomeECognome.compareTo(o.getNomeECognome()) < 0)		
		else if(o1.eta == o2.eta)	return 0;												//NomeECognome.compareTo(o.getNomeECognome()) == 0)		
		else	return 1;	
	}
	 
}
