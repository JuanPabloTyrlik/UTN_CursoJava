package clase4.DobleDispatching.DoubleDispatchEjemplo;

class Piedra implements Peleable {

    @Override
    public String vs(Peleable peleable) {
        return peleable.vs(this);
    }

    @Override
    public String vs(Tijera tijera) {
        return "gana tijera";
    }

    @Override
    public String vs(Papel papel) {
        return "gana papel";
    }

    @Override
    public String vs(Piedra piedra) {
        return "empate";
    }

    @Override
    public String toString() {
        return "Piedra";
    }

}
