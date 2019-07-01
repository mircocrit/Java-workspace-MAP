package esempioSerializzazione;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import esempioSerializzazione.Engine;;

public class Car implements Serializable{
	private final static String PATH = "C:\\Users\\Mirco\\git\\Java-workspace-MAP\\esempioSerializzazione\\src\\esempioSerializzazione\\prova.txt";
	private static final long serialVersionUID = 1L;
	private int targa;
	private String descrizione;
	private Engine motore;
	
	Car(int targa, String descrizione, Engine motore){
		this.setTarga(targa);
		this.setDescrizione(descrizione);
		
		this.setMotore(new Engine(motore.getNome(), motore.getDescrizione()));	//??
	}

	public Car() {}

	public int getTarga() {return targa;}
	public String getDescrizione() {return descrizione;}
	public Engine getMotore() {return motore;}
	
	public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
	public void setTarga(int targa) {this.targa = targa;}
	public void setMotore(Engine motore) {this.motore = motore;}
	
	public void saveCar() throws IOException{
		FileOutputStream outFile = new FileOutputStream(PATH);
		ObjectOutputStream outStream = new ObjectOutputStream(outFile);
		outStream.writeObject(this);
		outStream.close();		//chiudere stream
	}
	
	public Car loadCar() throws IOException, ClassNotFoundException{
		FileInputStream inFile = new FileInputStream(PATH);
		ObjectInputStream inStream = new ObjectInputStream(inFile);
		Car myCar = (Car)inStream.readObject();
		inStream.close();	//chiudere stream
		return myCar;
	}
	

}
