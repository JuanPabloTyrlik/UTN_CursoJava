package clase4.DobleDispatching;

class Tijera implements IJuego {

    public String vs(Piedra p) {
        return "Pierde";
    }

    public String vs(Tijera t) {
        return "Empata";
    }

    public String vs(Papel p) {
        return "Gana";
    }

    public String vs(IJuego j) {
        return null;
    }

    public String getType() {
        return "Tijera";
    }
}
