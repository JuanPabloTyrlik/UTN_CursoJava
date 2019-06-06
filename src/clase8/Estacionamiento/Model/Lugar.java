package clase8.Estacionamiento.Model;

public class Lugar {
    private static int totalLugares;
    private int id;
    private Vehiculo v;

    public Lugar(Vehiculo v) {
        super();
        id = ++totalLugares;
        this.v = v;
    }

    public boolean isOccupied(Vehiculo v) {
        return (v!=null);
    }

}
