import java.util.Comparator;

public class Studente implements Comparable<Studente>,Cloneable{ //, Comparator<Studente> {
	private String nome;
	private String cognome;
	private int matricola;
	
	public String getNome() {return nome;}
	public String getCognome() {return cognome;}
	public int getMatricola() {return matricola;}
	
	public void setNome(String nome) {this.nome = nome;}
	public void setCognome(String cognome) {this.cognome = cognome;}
	public void setMatricola(int matricola) {this.matricola = matricola;}
	
	 Studente(int matr, String nome, String cognome) {
		this.matricola=matr;
		this.nome=nome;
		this.cognome=cognome;
	}
	 
	 Studente() {
		this.matricola=0;
		this.nome=null;
		this.cognome=null;
	}
	 
	public boolean equals(Studente s) {
		if(s.matricola== this.matricola)			return true;
		else										return false;
	}
	public void print() {
		System.out.println(this.matricola +" "+ this.nome + " " + this.cognome+ " ");		
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
		if(matricola < o.getMatricola())		return -1;													//NomeECognome.compareTo(o.getNomeECognome()) < 0)		
		else if(matricola == o.getMatricola())	return 0;												//NomeECognome.compareTo(o.getNomeECognome()) == 0)		
		else									return 1;		
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