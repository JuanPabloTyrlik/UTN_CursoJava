package clase4.DobleDispatching.PiedraPapelTijera;

public class Papel extends Juego {
    @Override
    public String vs(Juego j) {
        return j.vs(this);
    }

    @Override
    public String vs(Piedra p) {
        return "Papel vs Piedra: ¡Gana Papel!";
    }

    @Override
    public String vs(Papel p) {
        return "Papel vs Papel: ¡Empate!";
    }

    @Override
    public String vs(Tijera p) {
        return "Papel vs Tijera: ¡Gana Tijera!";
    }
}
