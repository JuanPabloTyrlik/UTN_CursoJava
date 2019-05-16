package clase6.Estacionamiento.View;

import clase6.Estacionamiento.Controller.CocheraController;

import java.util.Scanner;

public class CocheraUI {
    private CocheraController cocheraController = CocheraController.getCocheraController();


    public void estacionar() {
        System.out.println("Ingrese patente");
        Scanner scanner = new Scanner(System.in);
        String patente = scanner.nextLine();
        cocheraController.iniciarEstacionamiento(patente);
        iniciar();
    }

    public void retirar() {
        System.out.println("Ingrese patente");
        Scanner scanner = new Scanner(System.in);
        String patente = scanner.nextLine();
        cocheraController.finalizarEstacionamiento(patente);
        iniciar();
    }

    public void imprimir() {
        cocheraController.imprimirTickets();
        iniciar();
    }

    public void definirCochera() {
        System.out.println("Ingrese precio por hora");
        Scanner scanner = new Scanner(System.in);
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese numero de piso");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese cantidad de lugares");
        int lugares = Integer.parseInt(scanner.nextLine());
        cocheraController.crearCochera(precio, num, lugares);
        System.out.println("Desea agregar otro piso? Y/N");
        String respuesta = scanner.nextLine();
        if (respuesta.equals("Y") || respuesta.equals("y")) {
            definirPiso();
        }
    }

    public void definirPiso() {
        String respuesta = "Y";
        int num,lugares;
        Scanner scanner = new Scanner(System.in);
        while (respuesta.equals("Y") || respuesta.equals("y")) {
            System.out.println("Ingrese numero de piso");
            num = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese cantidad de lugares");
            lugares = Integer.parseInt(scanner.nextLine());
            cocheraController.ampliarCochera(num,lugares);
            System.out.println("Desea agregar otro piso? Y/N");
            respuesta = scanner.nextLine();
        }
        iniciar();
    }

    public void definir() {
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1 Definir Cochera");
        System.out.println("2 Agregar Piso");
        System.out.println("X Salir");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1":
                definirCochera();
                break;
            case "2":
                definirPiso();
                break;
            case "X":
            case "x":
                break;
            default:
                System.out.println("Opcion invalida");
                definir();
        }
    }

    public void iniciar() {
        System.out.println("\nBienvenido al sistema de cochera");
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1 Estacionar");
        System.out.println("2 Retirar");
        System.out.println("3 Imprimir");
        System.out.println("4 Definir Cochera");
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
                definir();
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
