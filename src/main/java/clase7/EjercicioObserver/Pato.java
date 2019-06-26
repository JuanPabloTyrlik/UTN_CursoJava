package clase7.EjercicioObserver;

public class Pato implements Sensor {
    @Override
    public void cambioTemperatura(int temperatura) {
        if (temperatura <= 15) {
            System.out.println("Pato: Nadar");
        } else {
            if (temperatura >= 30) {
                System.out.println("Pato: Volar");
            }
        }
    }
}
