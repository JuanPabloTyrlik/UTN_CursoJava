package clase12.agenda;

import java.sql.Connection;
import java.sql.DriverManager;


public class PersonaDB {

    private static String DRIVER = "org.h2.Driver";
    private static String URL = "jdbc:h2:C:/Users/juan.pablo.tyrlik/IdeaProjects/H2";
    private static String USER = "JP";
    private static String PASS = "JP";

    public static Connection getConnection() throws Exception {
        // Registrar el driver
        Class.forName(DRIVER);
        // Obtener la conexion
        return DriverManager.getConnection(URL, USER, PASS);
    }

}
