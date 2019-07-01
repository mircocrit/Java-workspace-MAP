import java.io.Serializable;

class Esame implements Serializable{
	private static int codiceEsame=0;
	private String nome;
	private int voto;

	Esame(String nome, int voto){
		Esame.codiceEsame++;
		this.setNome(nome);
		this.setVoto(voto);	
		}
	public int getVoto() {	return voto;}	
	public void setVoto(int voto) {	this.voto = voto;}
	public String getNome() {	return nome;}
	public void setNome(String nome) {	this.nome = nome;}

} 
