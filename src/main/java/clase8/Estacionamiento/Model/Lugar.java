package clase8.Estacionamiento.Model;

import clase8.Estacionamiento.Exceptions.LugarOcupado;

public class Lugar {
    private static int totalLugares;
    private int id;
    private Vehiculo v;

    public Lugar(Vehiculo v) {
        super();
        id = ++totalLugares;
        this.v = v;
    }

    public boolean isOccupied() {
        return (v != null);
    }

    public void estacionar(Vehiculo v) throws LugarOcupado {
        if (!isOccupied()) {
            this.v = v;
        } else {
            throw new LugarOcupado();
        }
    }

}
