package clase8.Estacionamiento.Controller;

import clase8.Estacionamiento.Model.Vehiculo;

public class CocheraController {

    private static CocheraController cochera;

    private CocheraController() {
            super();
    }

    public synchronized static CocheraController getInstance() {
        if (cochera == null) cochera = new CocheraController();
        return cochera;
    }

    public void crearCochera(int numPiso, int cantLugares) {

    }

    public void iniciarEstacionamiento(Vehiculo v) {

    }

    public void finalizarEstacionamiento(Vehiculo v) {

    }

    public void imprimir() {

    }

    public double calcularIngresos() {
        return 0;
    }
}
