package clase8.Estacionamiento.Model;

import java.util.Calendar;

public class Ticket {
    private static int totalTickets;
    private int id;
    private Vehiculo vehiculo;
    private int piso;
    private Lugar lugar;
    private Calendar horaInicio;
    private Calendar horaFin;
    private double monto;

    public Ticket() {
        id = ++totalTickets;
        horaInicio = Calendar.getInstance();
    }

    public void estacionar(Vehiculo v) {

    }

    public void retirar(Vehiculo v) {

    }

}
