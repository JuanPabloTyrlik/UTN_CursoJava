package clase8.Estacionamiento.Model;

import clase8.Estacionamiento.Exceptions.PatenteInvalidaException;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {
    private String patente;

    public Vehiculo(String patente) throws PatenteInvalidaException {
        if (isPatente(patente)) {
            this.patente = patente;
        } else {
            throw new PatenteInvalidaException();
        }
    }

    private boolean isPatente(String patente) {
        String regex = "^([a-zA-Z]{3}[0-9]{3}|[a-zA-z]{2}[0-9]{3}[a-zA-Z]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(patente);
        return matcher.find();
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(patente, vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }
}
