import java.io.Serializable;

public class Esame implements Comparable<Esame>, Serializable {
	private int voto;
	private String esame;
	
	public int getVoto() {		return voto;}
	public String getEsame() {			return esame;}
	
	public void setVoto(int voto) {		this.voto = voto;}
	public void setEsame(String esame) {	this.esame = esame;}
	
	
	@Override
	public int compareTo(Esame e) {			
		if (this.voto == e.getVoto())		return 0;
		else if (this.voto < e.getVoto())	return -1;
		else 								return 1;
	}
	public void print() {
		System.out.println(this.getEsame() + "  " + this.getVoto());
	}
	
	
	
}
