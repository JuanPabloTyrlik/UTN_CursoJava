package clase6.Estacionamiento.Controller;

import clase6.Estacionamiento.Model.Cochera;
import clase6.Estacionamiento.Model.Piso;
import clase6.Estacionamiento.Model.Ticket;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CocheraController {
    private static CocheraController cocheraController;
    private Cochera cochera;
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public synchronized static CocheraController getCocheraController() {
        if (cocheraController == null) {
            cocheraController = new CocheraController();
        }
        return cocheraController;
    }

    private CocheraController() {
        super();
    }

    public boolean validPatente(String patente) {
        String regex = "^([a-zA-Z]{3}[0-9]{3}|[a-zA-z]{2}[0-9]{3}[a-zA-Z]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(patente);
        return matcher.find();
    }

    public void iniciarEstacionamiento(String patente) {
        boolean estacionado = false;
        if (validPatente(patente)) {
            if (cochera == null) {
                System.out.println("Necesita definir una cochera");
            } else {
                if (cochera.getEspacios() == null) {
                    System.out.println("Necesita definir al menos un piso");
                } else {
                    for (Map.Entry<Integer, Piso> entry : cochera.getEspacios().entrySet()) {
                        if (entry.getValue().hayLugarDisponible() == true) {
                            System.out.println("Estacione en el piso " + entry.getKey());
                            entry.getValue().estacionar(patente);
                            tickets.add(new Ticket(new Date(), patente));
                            estacionado = true;
                            break;
                        }
                    }
                    if (!estacionado)
                        System.out.println("No hay lugares disponibles");
                }
            }
        } else {
            System.out.println("Ingrese una patente valida");
        }
    }

    public void finalizarEstacionamiento(String patente) {
        if (validPatente(patente)) {
            for (Piso piso : cochera.getEspacios().values()) {
                piso.retirar(patente);
                for (Ticket ticket : tickets) {
                    if (ticket.getPatente().equals(patente)) {
                        ticket.finalizar();
                        break;
                    }
                }
            }
        } else {
            System.out.println("Ingrese una patente valida");
        }
    }

    public void crearCochera() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio por hora");
        cochera = new Cochera(Integer.parseInt(scanner.next()));
        System.out.println("Cochera Creada");
        System.out.println("Ingrese numero de piso");
        int numPiso = Integer.parseInt(scanner.next());
        System.out.println("Ingrese cantidad de lugares");
        int lugarPiso = Integer.parseInt(scanner.next());
        cochera.getEspacios().put(numPiso, new Piso(lugarPiso));
    }

    public void crearCochera(double precioPorHora, int numPiso, int lugaresPiso) {
        cochera = new Cochera(precioPorHora);
        cochera.getEspacios().put(numPiso, new Piso(lugaresPiso));
    }

    public void ampliarCochera(int numPiso, int lugares) {
        cochera.getEspacios().put(numPiso, new Piso(lugares));
    }

    public void imprimirTickets() {
        for (Ticket ticket : tickets) {
            System.out.println(ticket.toString());
        }
    }
}
