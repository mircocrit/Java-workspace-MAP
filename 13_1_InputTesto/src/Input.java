import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	public static void main(String[] args) throws IOException, ClassNotFoundException, NumberFormatException  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Stringa --- > ");
		String s = in.readLine();
		System.out.println(s);
	
		System.out.print("Numero --- > (intero) ");
		int a = Integer.parseInt(in.readLine());
		System.out.println(a+3);			
	}
}
