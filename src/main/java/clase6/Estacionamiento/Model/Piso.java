package clase6.Estacionamiento.Model;

import java.util.ArrayList;

public class Piso {
    private boolean lugarDisponible;
    private int cantLugares;
    private ArrayList<String> autosEstacionados;

    public boolean hayLugarDisponible() {
        return lugarDisponible;
    }

    public int lugar(String patente) {
        int i=1;
        for (String autosEstacionado : autosEstacionados) {
            if (autosEstacionado.equals(patente)) {
                return i;
            } else {
                i++;
            }
        }
        return i;
    }

    public void estacionar(String patente) {
        if (autosEstacionados.size()<cantLugares) {
            autosEstacionados.add(patente);
            System.out.println("Auto con patente "+patente+" ha estacionado en el lugar "+lugar(patente));
            if (autosEstacionados.size()==cantLugares) lugarDisponible=false;
        } else {
            System.out.println("No hay lugares disponibles en este piso");
        }
    }

    public void retirar(String patente) {
        if (autosEstacionados.contains(patente)) {
            autosEstacionados.remove(patente);
            lugarDisponible=true;
            System.out.println("El auto con patente "+patente+" ha sido retirado");
        }
    }

    public Piso(int cantLugares) {
        if (cantLugares>0) {
            lugarDisponible = true;
            this.cantLugares = cantLugares;
            autosEstacionados = new ArrayList<>();
        } else {
            System.out.println("El piso debe contener al menos 1 lugar");
        }
    }
}
