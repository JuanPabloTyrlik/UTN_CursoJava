package clase2;

public abstract class Empleado {
    private int id;
    String nombre;
    String apellido;
    String area;

    public abstract String obtenerInformacion();

    public Empleado(String nombre, String apellido, String area) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }

    Empleado() {
    }

    public int getId() {
        return id;
    }


    String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
