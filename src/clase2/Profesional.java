package clase2;

public class Profesional extends Operario {
    public String obtenerInformacion() {
        return super.obtenerInformacion() + "profesional " + super.getNombre() + " " + super.getApellido();
    }
    public Profesional(String nombre, String apellido, String area) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }

    public Profesional (){
    }
}
