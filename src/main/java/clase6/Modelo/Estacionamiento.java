package clase6.Modelo;

import java.util.Date;

public class Estacionamiento {
    private double monto;
    private Date horaInicio;
    private Date horaFin;
    private Auto auto;

    public Estacionamiento(Auto auto) {
        this.horaInicio = new Date();
        this.auto = auto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
