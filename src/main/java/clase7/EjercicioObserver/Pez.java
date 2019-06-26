package clase7.EjercicioObserver;

public class Pez implements Sensor{
    @Override
    public void cambioTemperatura(int temperatura) {
        if (temperatura >= 30) {
            System.out.println("Pez: Muere");
        }
    }
}
