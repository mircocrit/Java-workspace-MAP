import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception {  
	
    public static double sqrt(double x) throws IllegalArgumentException, IOException{
        if (x < 0)
            throw new IllegalArgumentException("sqrt: " + x);
        try {
        	Math.sqrt(x);
        }
        catch(NullPointerException n) {
        	BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        	try {
				x=Integer.parseInt(b.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			};
        	
        }
        return Math.sqrt(x);
    }
}
