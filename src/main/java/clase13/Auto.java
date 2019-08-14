package clase13;

public class Auto {

    private String color;
    private String patente;
    private String marca;
    private String modelo;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Auto(String color, String patente, String marca, String modelo) {
        super();
        this.color = color;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }


}
