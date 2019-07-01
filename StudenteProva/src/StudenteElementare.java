import java.util.Comparator;

public class StudenteElementare extends Studente implements Comparator<Studente>,Cloneable{
	private String classeElementare;
	
	StudenteElementare() {	super();}
	StudenteElementare(String matricola, String nomeECognome, int eta, String classeElementare){
		super(matricola,nomeECognome,eta);
		this.setClasseElementare(classeElementare);
	}
	
	@Override
	public void descrizione(){System.out.println("Studente elementare");}
	public String getClasseElementare() {return classeElementare;}
	public void setClasseElementare(String classeElementare) {this.classeElementare = classeElementare;}
	@Override
	public void print(){System.out.println(matricola+", "+NomeECognome+", "+eta+", "+classeElementare);}
	
	
}
