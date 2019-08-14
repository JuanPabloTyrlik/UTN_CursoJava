package clase4.DobleDispatching.PiedraPapelTijera;

abstract class Juego {
    public abstract String vs(Juego j);

    protected abstract String vs(Piedra p);

    protected abstract String vs(Papel p);

    protected abstract String vs(Tijera p);
}
