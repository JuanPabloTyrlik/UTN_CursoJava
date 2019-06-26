package clase4.DobleDispatching.DoubleDispatchEjemplo;

public interface Peleable {

    String vs(Peleable peleable);

    String vs(Tijera tijera);

    String vs(Papel papel);

    String vs(Piedra piedra);

}
