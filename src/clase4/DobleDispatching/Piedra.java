package clase4.DobleDispatching;

public class Piedra implements Juego {
    @Override
    public String vs(Piedra p) {
        return "Empata";
    }

    @Override
    public String vs(Tijera t) {
        return "Gana";
    }

    @Override
    public String vs(Papel p) {
        return "Pierde";
    }

    @Override
    public String getType() {
        return "Piedra";
    }
}
