package clase8.Estacionamiento.Controller;

import clase8.Estacionamiento.Model.Ticket;
import clase8.Estacionamiento.Model.Vehiculo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CocheraController {

    private static CocheraController cochera;
    private Set<Vehiculo> vehiculos = new HashSet<>();
    private List<Ticket> tickets = new ArrayList<>();

    private CocheraController() {
        super();
    }

    public synchronized static CocheraController getInstance() {
        if (cochera == null)
            cochera = new CocheraController();
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

    public double calcularIngreso() {
        return 0;
    }

    public double calcularMonto(Vehiculo v) {
        return 0;
    }

    public void registrarVehiculo(Vehiculo v) {

    }
}
