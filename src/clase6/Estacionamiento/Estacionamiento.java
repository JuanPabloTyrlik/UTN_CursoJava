package clase6.Estacionamiento;

import clase6.Estacionamiento.Controller.CocheraController;
import clase6.Estacionamiento.Model.Cochera;

public class Estacionamiento {
    //Usando MVC, hacer una aplicacion para una cochera de varios pisos. Requerido: iniciar/finalizar estacionamiento. Plus: calcular $ generada en el dia
    public static void main(String[] args) {
        CocheraController controller = CocheraController.getCocheraController();
        controller.crearCochera(50,1,10);
        controller.iniciarEstacionamiento("ABC123");
        controller.iniciarEstacionamiento("CDE345");
        controller.finalizarEstacionamiento("ABC123");
        controller.imprimirTickets();
    }

}
