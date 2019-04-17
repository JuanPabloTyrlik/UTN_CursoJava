package clase4.DobleDispatching;

public class Tijera implements Juego{
    @Override
    public String vsPiedra() {
        return "Pierde";
    }

    @Override
    public String vsTijera() {
        return "Empate";
    }

    @Override
    public String vsPapel() {
        return "Gana";
    }
}
