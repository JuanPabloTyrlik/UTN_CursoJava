package clase4.DobleDispatching;

public class Tijera implements Juego{
    @Override
    public String vs(Piedra p) {
        return "Pierde";
    }

    @Override
    public String vs(Tijera t) {
        return "Empata";
    }

    @Override
    public String vs(Papel p) {
        return "Gana";
    }

    @Override
    public String getType() {
        return "Tijera";
    }
}
