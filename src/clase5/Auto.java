package clase5;

import java.util.Objects;

public class Auto {
    private String modelo, color, marca, patente;

    public Auto(String patente, String marca, String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Auto auto = (Auto) o;
        return patente.equals(auto.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo='" + modelo + '\'' + ", color='" + color + '\'' + ", marca='" + marca + '\'' + ", patente='" + patente + '\'' + "}\n";
    }
}
