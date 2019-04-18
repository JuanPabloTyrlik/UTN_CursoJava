package DoubleDispatcheEjemplo;

public class Papel implements Peleable {

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
        return "empate";
    }

    @Override
    public String vs(Piedra piedra) {
        return "gana papel";
    }

    @Override
	public String toString() {
		return "Papel";
	}
}
