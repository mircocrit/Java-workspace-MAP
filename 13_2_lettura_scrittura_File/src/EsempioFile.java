import java.io.*;

public class EsempioFile {

	public static void main(String[] args) throws IOException {		
		////////////////////LETTURA/////////////////////////
		String s= new String();
		BufferedReader reader = new BufferedReader (
				new FileReader ("C:\\Users\\Mirco\\git\\Java-workspace-MAP\\13_Lettura_scritturaFile\\src\\provaLettura.txt"));
		s=reader.readLine();
		while(s!=null) {
				System.out.println(s);
				s=reader.readLine();
		}
		reader.close();
		
		////////////////////SCRITTURA/////////////////////////
		BufferedWriter writer =new BufferedWriter (
				new FileWriter("C:\\Users\\Mirco\\git\\Java-workspace-MAP\\13_Lettura_scritturaFile\\src\\provaScrittura.txt"));
		writer.write(" "+ Float.toString(32));
		writer.close();
		}
	
	
	

}
