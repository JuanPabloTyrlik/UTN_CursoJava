package clase12.agenda;

import java.sql.Connection;
import java.sql.DriverManager;


public class PersonaDB {

	private static String DRIVER ="org.h2.Driver";
	private static String URL ="jdbc:h2:~/tools/db/ejemplo";
	
	public Connection getConnection() throws Exception {
		// Registrar el driver
		Class.forName(DRIVER);
		// Obtener la conexion
		return  DriverManager.getConnection(URL);
	}
	
}
