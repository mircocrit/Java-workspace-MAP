import java.io.*;

public class EsempioFile {

	public static void main(String[] args) throws IOException {		
		////////////////////LETTURA/////////////////////////
		String s= new String();
		BufferedReader b = new BufferedReader (
				new FileReader ("C:\\Users\\Mirco\\git\\Java-workspace-MAP\\13_2_lettura_scrittura_File\\src\\provaLettura.txt"));
		s=b.readLine();
		
		while(s!=null) {
			System.out.println(s);
			s=b.readLine();
		}
		b.close();
		
		////////////////////SCRITTURA/////////////////////////
		BufferedWriter writer =new BufferedWriter (
				new FileWriter("C:\\Users\\Mirco\\git\\Java-workspace-MAP\\13_2_lettura_scrittura_File\\src\\provaScrittura.txt"));
		writer.write(" "+ Float.toString(32));
		writer.close();
		}
	
	
	

}
