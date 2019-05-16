package clase7.Observer;

import java.util.ArrayList;
import java.util.List;

public class CasaInteligente {
    List<Sensor> sensores = new ArrayList<>();

    public CasaInteligente() {
        super();
        sensores.add(new Climatizador());
        sensores.add(new AlarmaDeIncendio());
        sensores.add(new AlarmaDeIncendio());
    }

    public void setTemperatura(int temperatura) {
        for (Sensor sensor : sensores) {
            sensor.cambiodeTemperatura(temperatura);
        }
    }
}
