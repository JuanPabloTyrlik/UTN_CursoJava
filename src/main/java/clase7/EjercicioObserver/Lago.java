package clase7.EjercicioObserver;

import java.util.ArrayList;
import java.util.List;

public class Lago {
    List<Sensor> sensors = new ArrayList<>();

    public Lago() {
        super();
        sensors.add(new Pato());
        sensors.add(new Rana());
        sensors.add(new Pez());
    }

    public void setTemperatura(int temperatura) {
        System.out.println("Temperatura: " + temperatura);
        for (Sensor sensor : sensors) {
            sensor.cambioTemperatura(temperatura);
        }
        System.out.println();
    }
}
