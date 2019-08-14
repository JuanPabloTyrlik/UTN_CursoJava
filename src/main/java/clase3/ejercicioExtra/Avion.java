package clase3.ejercicioExtra;

public class Avion extends Estructura {

    public Avion() {
        super();
    }

    public boolean atravezar(Estructura e) {
        return e.atravezar(this);
    }
}
	


