package clase4.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    String nombre;
    String apellido;
    String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public static List<Persona> invertir(List<Persona> personas) {
        List<Persona> inverso = new ArrayList<>();
        for (int i = personas.size()-1; i >= 0; i--) {
            inverso.add(personas.get(i));
        }
        return inverso;
    }

    public String imprimir() {
        return (dni+"\t"+nombre+"\t"+apellido);
    }
}
