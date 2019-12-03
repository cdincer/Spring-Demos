
import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_customer_tracker?useSSL=false&serverTimezone=UTC";
		String user="hbcustomer";
		String pass="12345";
		
		
		try 
		{
			System.out.println("Connecting to database:"+jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection succesful");

		
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	}


}
