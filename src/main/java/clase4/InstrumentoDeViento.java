package clase4;

public class InstrumentoDeViento implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando un instrumento " + this.tipoInstrumento());
    }

    @Override
    public void afinar() {
        System.out.println("Afinando un instrumento " + this.tipoInstrumento());
    }

    @Override
    public String tipoInstrumento() {
        return "de viento";
    }
}
