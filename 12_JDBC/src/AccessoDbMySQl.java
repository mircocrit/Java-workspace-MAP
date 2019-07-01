import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//
public class AccessoDbMySQl {
    public static void main(String[] args) {
    	//
    	///cambiare zone
    	//cd C:\\xampp\\mysql\\bin
    	//mysql -u root -p
    	//SET GLOBAL time_zone = '+2:00';
    
    	String url ="jdbc:mysql://localhost/esempio";//+	//"?useUnicode=true"+"&useJDBCCompliantTimezoneShift=true"+	"&useLegacyDatetimeCode=false"+	"&serverTimezone=UTC";
    	
    	String user= "root";
    	String password= "";
    	
    	String query="select matricola, stipendio from Dipendente";
    	/*
        String query2= "insert into attore values " + 
        		"(555,	'Alain',	'Delon',	'1994-01-01'), " + 
        		"(666,	'Lorenzo ',	'Zurzolo ', '2000-03-21'), " + 
        		"(777,	'Michael',	'Shumacher','1973-01-01'), " + 
        		"(888,	'Sebastian', 'Bint',	'1997-07-03'); ";
        String delete = "delete from dipendente where CF = 777";
		String update = "update dipendente set Nome = 'PippoKill' where CF = 444";
    	*/
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {} 
        
        try {
        	Connection conn = DriverManager.getConnection(url,user,password);
        	Statement s = conn.createStatement();
        	//////////
            ResultSet r = s.executeQuery(query);	//s.executeUpdate(query2);
            
            System.out.println("Matricola " + "Stipendio	");
            System.out.println("-----------------------------");          
            while(r.next())
            	System.out.println(r.getString("matricola") + "	" + r.getString("stipendio"));
            
        } catch (SQLException ex) {	           
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }        
    }
}
   