package clase10;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Alumno {

    private String nombre;
    private String apellido;
    private Map<String, Double> materias = new HashMap<>();

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void actualizarNota (String materia, Double nota) {
        materias.put(materia,nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Map<String, Double> getMaterias() {
        return materias;
    }

    public void setMaterias(Map<String, Double> materias) {
        this.materias = materias;
    }


}
