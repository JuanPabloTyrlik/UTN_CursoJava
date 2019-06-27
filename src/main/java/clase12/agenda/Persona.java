package clase12.agenda;

import java.util.Objects;

public class Persona {

    private int dni;
    private String nombre;
    private String apellido;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public Persona(int dni, String nombre, String apellido) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Persona persona = (Persona) o;
        return dni == persona.dni && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellido);
    }

    public Persona() {
        super();
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }


}
