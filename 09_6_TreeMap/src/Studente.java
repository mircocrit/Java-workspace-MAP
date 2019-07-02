
import java.util.Comparator;

public class Studente implements Comparable<Studente>,Cloneable{ //, Comparator<Studente> {
	private String nome;
	private String cognome;
	private int eta;
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getCognome() {return cognome;}
	public void setCognome(String cognome) {this.cognome = cognome;}
	public int getEta() {return eta;}
	public void setEta(int matricola) {this.eta = eta;}
	
	 Studente(String nome, String cognome,int eta) {
		this.eta=eta;
		this.nome=nome;
		this.cognome=cognome;
	}
	 
	 Studente() {
		this.eta=0;
		this.nome=null;
		this.cognome=null;
	}
	 

	public void print() {
		System.out.println(this.nome + " " + this.cognome+ " " + this.eta);		
	}
	
////////////////////////////////////////
	
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
		//System.out.println("Comparable");
		if(eta < o.getEta())		return -1;													//NomeECognome.compareTo(o.getNomeECognome()) < 0)		
		else if(eta == o.getEta())	return 0;												//NomeECognome.compareTo(o.getNomeECognome()) == 0)		
		else						return 1;		
	}
	/*
	@Override
	public int compare(Studente o1, Studente o2) {	
		//System.out.println("Comparator");
		if(o1.getMatricola() < o2.getMatricola())			return -1;
		else if(o1.getMatricola() == o2.getMatricola())		return 0;
		else									return 1;
	}
	
	public boolean equals(Object o) {
		Studente s = (Studente)o;
		//return (this.matricola.compareTo(s.matricola) == 0);
		return (this.matricola == s.getMatricola());	
	}
	*/
}