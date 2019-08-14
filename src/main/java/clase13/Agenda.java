package clase13;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Agenda {

    private Map<String, List<Persona>> personas = new HashMap();

    private Connection getConnection() throws Exception {
        try {
            Connection c = new PersonaDB().getConnection();
            return c;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private void rollback(Connection c) throws Exception {
        try {
            c.rollback();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private void close(Connection c) throws Exception {
        try {
            c.close();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void add(Persona p) throws Exception {

        Connection c = new PersonaDB().getConnection();

        String insert = "INSERT INTO PERSONA (NOMBRE, APELLIDO, DNI) VALUES ('" + p.getNombre() + "','" + p.getNombre() + "','" + p.getTelefono() + "')";
        executeSql(c, insert);


    }

    public List<Persona> get(String primerLetra) throws Exception {
        Connection c = new PersonaDB().getConnection();
        String sql = "SELECT * FROM PERSONA WHERE NOMBRE LIKE '" + primerLetra.toUpperCase() + "%'";
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Persona> lista = new ArrayList<Persona>();
        while (rs.next()) {
            lista.add(new Persona(rs.getString("NOMBRE"), rs.getString("DNI")));
        }
        return lista;
    }

    public void delete(Persona p) throws Exception {
        Connection c = new PersonaDB().getConnection();
        String sql = "DELETE FROM PERSONA WHERE NOMBRE = '" + p.getNombre() + "'";
        executeSql(c, sql);
    }

    private void executeSql(Connection c, String sql) throws Exception {
        try {
            Statement stmt = c.createStatement();
            stmt.execute(sql);
            c.commit();
        } catch (Exception e) {
            rollback(c);
            throw new Exception("Error el insertar la persona");
        } finally {
            close(c);
        }
    }


}
