package Clase2;

public abstract class Empleado {
    private int id;
    protected String nombre;
    protected String apellido;
    protected String area;

    public abstract String obtenerInformacion();

    public Empleado(String nombre, String apellido, String area) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }

    public Empleado() {
    }

    public int getId() {
        return id;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
