package clase4.DobleDispatching.DoubleDispatchEjemplo;

public class Tijera implements Peleable {

	@Override
    public String vs(Peleable peleable) {
        return peleable.vs(this);
    }

    @Override
    public String vs(Tijera tijera) {
        return "empate";
    }

    @Override
    public String vs(Papel papel) {
        return "gana tijera";
    }

    @Override
    public String vs(Piedra piedra) {
        return "gana piedra";
    }

    @Override
	public String toString() {
		return "Tijera";
	}

}
