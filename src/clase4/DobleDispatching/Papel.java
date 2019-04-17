package clase4.DobleDispatching;

public class Papel implements Juego {
    @Override
    public String vsPiedra() {
        return "Gana";
    }

    @Override
    public String vsTijera() {
        return "Pierde";
    }

    @Override
    public String vsPapel() {
        return "Empate";
    }
}
