package clase10;

import java.util.HashMap;
import java.util.Map;

public class Alumno {

    private String nombre;
    private String apellido;
    private Map<String, String> materias = new HashMap<>();

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void actualizarNota (String materia, String nota) {
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

    public Map<String, String> getMaterias() {
        return materias;
    }

    public void setMaterias(Map<String, String> materias) {
        this.materias = materias;
    }


}
