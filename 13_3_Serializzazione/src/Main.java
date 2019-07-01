import java.io.*;

public class Main {
	private static final String PATH ="C:\\Users\\Mirco\\git\\Java-workspace-MAP\\7_13_Serializzazione\\src\\prova.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Esame exam = new Esame("ASD",28);
		//Esame exam2 = new Esame("Basi",30);
		//--------------------------------------------------------
		FileOutputStream outFile = new FileOutputStream(PATH);
		ObjectOutputStream outStream = new ObjectOutputStream(outFile);
										outStream.writeObject(exam);
		outStream.close();
		//----------------------------------------------------------
		FileInputStream inFile = new FileInputStream(PATH);
		ObjectInputStream inStream = new ObjectInputStream(inFile);
		Esame exam2 = (Esame)inStream.readObject();
		inStream.close();
		
		System.out.println(exam2.getNome()+ ","+exam2.getVoto());

	}
	
}
