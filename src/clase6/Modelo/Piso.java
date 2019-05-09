package clase6.Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Piso {
    private boolean lleno = false;
    private ArrayList<Auto> lugares;

    public ArrayList<Auto> getLugares() {
        return lugares;
    }

    public void setLugares(ArrayList<Auto> lugares) {
        this.lugares = lugares;
    }

    public Piso(boolean lleno, ArrayList<Auto> lugares) {
        this.lleno = lleno;
        this.lugares = lugares;
    }

    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }


}
