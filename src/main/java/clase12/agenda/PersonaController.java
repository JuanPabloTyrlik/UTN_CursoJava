package clase12.agenda;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaController {

    private List<Persona> personas = new ArrayList();

    public void getAll() {
        try {
            Connection c = getConnection();
            try {
                Statement stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Persona");
                System.out.println("----------------------");
                while (rs.next()) {
                    Persona p = new Persona(rs.getInt("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDO"));
                    System.out.println(p.toString());
                }
                System.out.println("----------------------");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                close(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Persona add(Persona p) throws PersonaException {
        try {
            Connection c = getConnection();
            try {
                Statement stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Persona WHERE DNI = " + p.getDni());
                if (!rs.next()) {
                    throw new PersonaException("La persona ya está en la agenda");
                } else {
                    String sql = "INSERT INTO Persona (DNI, NOMBRE, APELLIDO) VALUES (" + p.getDni() + ", '" + p.getNombre() + "', '" + p.getApellido() + "')";
                    stmt.execute(sql);
                    c.commit();
                }
            } catch (SQLException e) {
                rollback(c);
            } catch (Exception e) {
                rollback(c);
            } finally {
                close(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    private void close(Connection c) throws PersonaException {
        try {
            c.close();
        } catch (SQLException e) {
            throw new PersonaException("No pude cerrar la conexion");
        }
    }

    private void rollback(Connection c) throws PersonaException {
        try {
            c.rollback();
        } catch (SQLException e) {
            throw new PersonaException("No pude hacer un rollback");
        }

    }

    private Connection getConnection() throws PersonaException {
        try {
            Connection c = PersonaDB.getConnection();
            c.setAutoCommit(false);
            return c;
        } catch (Exception e) {
            throw new PersonaException("No pude conectarme a la DB");
        }
    }

    public boolean delete(Persona p) throws PersonaException {
        if (!personas.contains(p))
            throw new PersonaException("No existe la persona");
        personas.remove(p);
        return true;
    }

    public Persona search(String nombre) throws PersonaException {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }
        throw new PersonaException("No existe la persona");
    }

    public boolean testConnection() {
        try {
            boolean b = !(new PersonaDB()).getConnection().isClosed();
            (new PersonaDB()).getConnection().close();
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
