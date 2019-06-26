package clase4.Ejercicio;

import java.util.ArrayList;
import java.util.List;

class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    static List<Persona> invertir(List<Persona> personas) {
        List<Persona> inverso = new ArrayList<>();
        for (int i = personas.size()-1; i >= 0; i--) {
            inverso.add(personas.get(i));
        }
        return inverso;
    }

    String imprimir() {
        return (dni+"\t"+nombre+"\t"+apellido);
    }
}
