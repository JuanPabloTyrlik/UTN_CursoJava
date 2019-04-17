package clase4;

import java.util.List;

public class Orquesta {
    public void tocar(InstrumentoMusical i) {
        i.tocar();
    }
    public void afinar(InstrumentoMusical i) {
        i.afinar();
    }

    public void tocar(List<InstrumentoMusical> instrumentos) {
        for (InstrumentoMusical instrumentoMusical : instrumentos) {
            instrumentoMusical.tocar();
        }
    }
}
