package firstjdbcConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
private static Connection con;
	public static Connection createConnection() throws Exception {
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagement","root","RITU");
		return con;
	
	}

}
