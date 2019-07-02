import java.io.*;

public class AppMain {
	private static final String PATH ="C:\\Users\\Mirco\\git\\Java-workspace-MAP\\13_3_Serializzazione\\src\\prova.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Esame [] exam  = new Esame [4];
		exam[0]= new Esame("Basi",30);
		exam[1]=new Esame("ASD",28);
		exam[2]= new Esame("MAP",28);
		exam[3]= new Esame("IngSW",20);
		
		serializzazione(PATH,exam);
		Esame [] exam2  = new Esame [4];
		exam2= deserializzazione(PATH);
		
		for( int i=0; i<exam2.length;i++) {
			exam2[i].print();
		}
	}
	
	
	public static void serializzazione(String PATH,Esame [] exam ) throws IOException {
		FileOutputStream outFile = new FileOutputStream(PATH);
		ObjectOutputStream outStream = new ObjectOutputStream(outFile);
										outStream.writeObject(exam);
		outStream.close();
	}
	
	public static Esame[] deserializzazione(String PATH) throws IOException, ClassNotFoundException {
		FileInputStream inFile = new FileInputStream(PATH);
		ObjectInputStream inStream = new ObjectInputStream(inFile);
		Esame [] exam = (Esame [])inStream.readObject();
		inStream.close();
		return exam;
	}
	
}
