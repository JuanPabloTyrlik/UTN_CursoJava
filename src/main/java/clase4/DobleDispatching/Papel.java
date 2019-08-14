package clase4.DobleDispatching;

class Papel implements IJuego {

    public String vs(Piedra piedra) {
        return "Gana";
    }

    public String vs(Papel papel) {
        return "Empata";
    }

    public String vs(Tijera tijera) {
        return "Pierde";
    }

    public String vs(IJuego j) {
        return j.vs(this);
    }

    public String getType() {
        return "Papel";
    }
}
