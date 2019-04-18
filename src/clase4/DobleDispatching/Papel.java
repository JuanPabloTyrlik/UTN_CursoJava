package clase4.DobleDispatching;

public class Papel implements Juego {
    @Override
    public String vs(Piedra p) {
        return "Gana";
    }

    @Override
    public String vs(Papel p) {
        return "Empata";
    }

    @Override
    public String vs(Tijera p) {
        return "Pierde";
    }

    @Override
    public String getType() {
        return "Papel";
    }
}
