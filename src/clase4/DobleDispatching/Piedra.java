package clase4.DobleDispatching;

public class Piedra implements Juego {
    @Override
    public String vsPiedra() {
        return "Empate";
    }

    @Override
    public String vsTijera() {
        return "Gana";
    }

    @Override
    public String vsPapel() {
        return "Pierde";
    }
}
