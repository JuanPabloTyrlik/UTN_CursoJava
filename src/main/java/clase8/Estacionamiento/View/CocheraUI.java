package clase8.Estacionamiento.View;

import clase8.Estacionamiento.Controller.CocheraController;

import java.util.Scanner;

public class CocheraUI {
    private static final CocheraController controller = CocheraController.getInstance();

    private void crearCochera() {

    }

    private void estacionar() {
    }

    private void retirar() {

    }

    private void imprimir() {

    }

    private void calcularIngreso() {

    }


    public void iniciar() {
        System.out.println("\nBienvenido al sistema de cochera");
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1 Estacionar");
        System.out.println("2 Retirar");
        System.out.println("3 Imprimir");
        System.out.println("4 Nueva Cochera");
        System.out.println("5 Registrar Vehiculo");
        System.out.println("6 Calcular Ingresos");
        System.out.println("7 Calcular Ingresos de un Vehiculo");
        System.out.println("0 Salir");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1":
                estacionar();
                break;
            case "2":
                retirar();
                break;
            case "3":
                imprimir();
                break;
            case "4":
                crearCochera();
                break;
            case "0":
                break;
            default:
                System.out.println("Opcion invalida");
                iniciar();
        }
    }

    public static void main(String[] args) {
        CocheraUI cocheraUI = new CocheraUI();
        cocheraUI.iniciar();
    }
}
