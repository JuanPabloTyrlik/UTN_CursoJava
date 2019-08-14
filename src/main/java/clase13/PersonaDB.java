package clase13;

import java.sql.Connection;
import java.sql.DriverManager;


public class PersonaDB {

	private static String DRIVER ="org.h2.Driver";
	private static String URL ="jdbc:h2:~/tools/db/ejemplo2";
	
	public Connection getConnection() throws Exception {
		// Registrar el driver
		Class.forName(DRIVER);
		// Obtener la conexion
		Connection c =  DriverManager.getConnection(URL);
		
		c.setAutoCommit(false);
		
		return c;
	}
	
}
