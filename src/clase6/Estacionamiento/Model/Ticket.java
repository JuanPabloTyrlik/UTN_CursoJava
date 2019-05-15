package clase6.Estacionamiento.Model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ticket {
    private double monto;
    private Date horaInicio;
    private Date horaFin;
    private String patente;

    public Ticket(Date horaInicio, String patente) {
        this.horaInicio = horaInicio;
        this.patente = patente;
    }

    public double getMonto() {
        return monto;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public String getPatente() {
        return patente;
    }

    public void finalizar() {
        horaFin = new Date();
        monto = Cochera.getPrecioPorHora()+Cochera.getPrecioPorHora()*(TimeUnit.HOURS.convert((horaFin.getTime()-horaInicio.getTime()),TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return "Ticket{" + "monto=" + monto + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", patente='" + patente + '\'' + '}';
    }
    
}
