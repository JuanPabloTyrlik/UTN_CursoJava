package clase6.Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Cochera {
    private double precioHora;
    private HashMap<Integer, ArrayList<Piso>> pisos;

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public HashMap<Integer, ArrayList<Piso>> getPisos() {
        return pisos;
    }

    public void setPisos(HashMap<Integer, ArrayList<Piso>> pisos) {
        this.pisos = pisos;
    }

    public Cochera(double precioHora, HashMap<Integer, ArrayList<Piso>> pisos) {
        this.precioHora = precioHora;
        this.pisos = pisos;
    }

    public boolean lugarLibre() {
        if (pisos.containsValue(false)){ //Revisar si funciona, sino recorrer keys -> flag y ver si hay alguno false.
            return true;
        }
        return false;
    }
}
