package esempioSerializzazione;

import java.io.*;

import esempioSerializzazione.Car;

public class AppMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Car myCar1 = new Car();
		Engine motore1 = new Engine();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Descrizione --- > ");
		myCar1.setDescrizione(in.readLine());
		
		System.out.print("Targa --- > ");
		myCar1.setTarga(Integer.parseInt(in.readLine()));	//conversione di string in int
		
		//System.out.print("Nome motore --- > ");
		//myCar1.setMotore(in.readLine());
		
		//System.out.print("Descrizione motore --- > ");
		//myCar1.setMotore.setDescrizione(in.readLine());
		
		//stampa a video
		//System.out.println(myCar1.getTarga()+","+myCar1.getDescrizione());	
		//try
		//{
		myCar1.saveCar();
		
		///////////////////////////////////////
		//PROVA SERIALIZZAZIONE AUTO GIA CREATA
		//Engine motore = new Engine("Ford", "V8");
		//Car myCar = new Car(1, "Ford Fiesta", motore);
		//myCar1.saveCar();
		
		
		
		//////////////////////DESERIALIZZAZIONE/////////////////
		Car newCar = new Car(); 
		newCar = myCar1.loadCar();
		System.out.println(newCar.getTarga()+","+newCar.getDescrizione());
		//}
		//catch (IOException | ClassNotFoundException e) 
		//{
		//	e.getMessage();
		//}
		
	}
	
}
