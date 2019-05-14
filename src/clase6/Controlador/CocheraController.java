package clase6.Controlador;

import clase6.Modelo.Auto;
import clase6.Modelo.Cochera;
import clase6.Modelo.Estacionamiento;

import java.util.ArrayList;
import java.util.Date;

public class CocheraController {
    private static Cochera cochera;
    private ArrayList<Estacionamiento> estacionamientos;

    public static void iniciar() {

        //imprime menu
    }

    public void menu(){
        //imprime el menu y decide que hacer a partir de la respuesta
    }

    public boolean iniciarEstacionamiento(Auto auto) {
        //Crear estacionamiento para el auto asignado
        //True o false para ver si se pudo realizar.
        if (cochera.lugarLibre()) {
            //Crear Estacionamiento
        }
        return false;
    }

    public boolean finalizarEstacionmiento(Auto auto, Date horaFin ) {
        //Finalizar estacionamiento para el auto y devolver monto a pagar
        //True o false para ver si se pudo realizar.
        return false;
    }

    public static Cochera getCochera() {
        return cochera;
    }

    public ArrayList<Estacionamiento> getEstacionamientos() {
        return estacionamientos;
    }

    public void setEstacionamientos(ArrayList<Estacionamiento> estacionamientos) {
        this.estacionamientos = estacionamientos;
    }

}
