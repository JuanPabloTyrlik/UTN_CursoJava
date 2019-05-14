package clase6.Estacionamiento.Model;

import java.util.HashMap;

public class Cochera {
    private static double precioPorHora;
    private HashMap<Integer, Piso> espacios;

    public Cochera(double precioPorHora) {
        this.precioPorHora = precioPorHora;
        espacios = new HashMap<>();
    }

    public void nuevoPiso (int numeroPiso, int lugares) {
        espacios.put(numeroPiso, new Piso(lugares));
    }

    public static double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public HashMap<Integer, Piso> getEspacios() {
        return espacios;
    }

}
