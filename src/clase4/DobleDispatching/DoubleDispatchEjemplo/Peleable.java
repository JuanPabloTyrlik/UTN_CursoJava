package clase4.DobleDispatching.DoubleDispatchEjemplo;

public interface Peleable {

    public String vs(Peleable peleable);

    public String vs(Tijera tijera);

    public String vs(Papel papel);

    public String vs(Piedra piedra);

}
