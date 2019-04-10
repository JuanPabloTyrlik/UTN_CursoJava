package Clase3;

public class Automovil {
    protected String marca;
    protected String modelo;
    protected int año;
    protected Tanque tanque;

    public double hacerKM(double distKM) {
        return (distKM*7/100)*tanque.getPrecioLitro();
    }

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int año, Tanque tanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tanque = tanque;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }
}
