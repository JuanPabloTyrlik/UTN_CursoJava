package clase4.DobleDispatching.PiedraPapelTijera;

public class Tijera extends Juego {
    @Override
    public String vs(Juego j) {
        return j.vs(this);
    }

    @Override
    public String vs(Piedra p) {
        return "Tijera vs Piedra: ¡Gana Piedra!";
    }

    @Override
    public String vs(Papel p) {
        return "Tijera vs Papel: ¡Gana Tijera!";
    }

    @Override
    public String vs(Tijera p) {
        return "Tijera vs Tijera: ¡Empate!";
    }
}
