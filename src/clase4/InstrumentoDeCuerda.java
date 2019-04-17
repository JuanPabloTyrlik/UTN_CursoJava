package clase4;

public abstract class InstrumentoDeCuerda implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando "+this.tipoInstrumento());
    }

    @Override
    public void afinar() {
        System.out.println("Afinando "+this.tipoInstrumento());
    }

    @Override
    public String tipoInstrumento() {
        return "de cuerda";
    }
}
