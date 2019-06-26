package clase3;

abstract class Instrumento {

    private String nombre;
    private String tipo;

    public abstract void tocar();

    String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
