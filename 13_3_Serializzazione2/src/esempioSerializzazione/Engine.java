package esempioSerializzazione;

import java.io.Serializable;

public class Engine implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private String descrizione;
	
	Engine(){}
	
	Engine(String nome, String descrizione){
		this.setNome(nome);
		this.setDescrizione(descrizione);
	}

	public String getNome() 						{return nome;}
	public String getDescrizione() 					{return descrizione;}
	public void setNome(String nome) 				{this.nome = nome;}
	public void setDescrizione(String descrizione)  {this.descrizione = descrizione;}

}
