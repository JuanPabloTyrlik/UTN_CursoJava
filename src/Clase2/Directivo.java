package Clase2;

public class Directivo extends Empleado{
    public String obtenerInformacion() {
        return ("Directivo "+super.getNombre()+" "+super.getApellido());
    }

    public Directivo(String nombre, String apellido, String area) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }

    public Directivo() {
    }
}
