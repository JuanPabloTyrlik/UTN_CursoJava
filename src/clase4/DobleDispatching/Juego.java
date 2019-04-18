package clase4.DobleDispatching;

public interface Juego {

    String vs(Piedra p);
    String vs(Papel p);
    String vs(Tijera p);
    String getType();
}
