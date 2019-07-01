import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Studente implements Serializable {
	private int matricola;
	private String nome;
	private String cognome;
	private List<Esame> esami = new ArrayList<Esame>();
	
	public int getMatricola() {		return matricola;}
	public void setMatricola(int matricola) {	this.matricola = matricola;}
	public String getNome() {	return nome;}
	public void setNome(String nome) {	this.nome = nome;}
	public String getCognome() {	return cognome;}
	public void setCognome(String cognome) {	this.cognome = cognome;}
	public List<Esame> getEsami() {		return esami;}
	public void setEsami(List<Esame> esami) {	this.esami = esami;}
	
	public void setList() throws IOException {
		//Esame e = new Esame();
		System.out.println("");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			Esame e = new Esame();
			System.out.println("nome esame: ");
			String s= r.readLine();
			if(s.equals("")) {
				System.out.println("");
				return;
			}
			else {
				e.setEsame(s);
				
				System.out.println("voto: ");
				e.setVoto(Integer.parseInt(r.readLine()));
				esami.add(e);
			}
		}
		
	}
	
	public void print(){
		System.out.println("matricola: " + this.matricola);
		System.out.println("nome: " + this.nome);	
		System.out.println("cognome: " + this.cognome);
		
		esami.sort(null);
		//Iterator<Esame> e = esami.iterator();
		System.out.println("");
		for(int i=0; i<esami.size();i++)	esami.get(i).print();
		//while(e.hasNext()) {
		//	Esame temp= new Esame();
		//	e.next().print();
		//}
	}
	
}