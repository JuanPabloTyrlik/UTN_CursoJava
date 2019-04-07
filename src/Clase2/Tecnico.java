package Clase2;

public class Tecnico extends Operario {
    public String obtenerInformacion() {
        return super.obtenerInformacion() + "técnico " + super.getNombre() + " " + super.getApellido();
    }

    public Tecnico() {
    }

    public Tecnico(String nombre, String apellido, String area) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }
}
