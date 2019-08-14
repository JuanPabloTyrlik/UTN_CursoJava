package clase4.DobleDispatching;

interface IJuego {
    String vs(Piedra p);

    String vs(Papel p);

    String vs(Tijera t);

    String vs(IJuego j);

    String getType();
}
