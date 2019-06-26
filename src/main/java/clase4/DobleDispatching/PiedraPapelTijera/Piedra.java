package clase4.DobleDispatching.PiedraPapelTijera;

class Piedra extends Juego {
    @Override
    public String vs(Juego j) {
        return j.vs(this);
    }

    @Override
    public String vs(Piedra p) {
        return "Piedra vs Piedra: ¡Empate!";
    }

    @Override
    public String vs(Papel p) {
        return "Piedra vs Papel: ¡Gana Papel!";
    }

    @Override
    public String vs(Tijera p) {
        return "Piedra vs Tijera: ¡Gana Piedra!";
    }
}
