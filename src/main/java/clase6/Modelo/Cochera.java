package clase6.Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Cochera {
    private static Cochera cochera;
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

    private Cochera(double precioHora, HashMap<Integer, ArrayList<Piso>> pisos) {
        this.precioHora = precioHora;
        this.pisos = pisos;
    }

    public boolean lugarLibre() {
        if (pisos.containsValue(false)){ //Revisar si funciona, sino recorrer keys -> flag y ver si hay alguno false.
            return true;
        }
        return false;
    }

    public static Cochera getCochera(double precioHora, HashMap<Integer, ArrayList<Piso>> pisos) {
        if (cochera==null)
            cochera = new Cochera(precioHora, pisos);
        return cochera;
    }
}
