package clase6.Vista;

import clase6.Controlador.CocheraController;

public class CocheraUI {
    public static void iniciarUI() {
        CocheraController.iniciar();
        System.out.println("Bienvenidos");
        System.out.println("1. Iniciar Estacionamiento");
        System.out.println("2. Finalizar Estacionamiento");
        System.out.println("3. ");
    }
}
