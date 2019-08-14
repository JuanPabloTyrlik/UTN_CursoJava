package clase4.DobleDispatching;

class Piedra implements IJuego {

    public String vs(Piedra piedra) {
        return "Empata";
    }

    public String vs(Tijera tijera) {
        return "Gana";
    }

    public String vs(Papel papel) {
        return "Pierde";
    }

    public String vs(IJuego j) {
        return j.vs(this);
    }

    public String getType() {
        return "Piedra";
    }
}
