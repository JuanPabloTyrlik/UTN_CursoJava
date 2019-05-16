package clase7.EjercicioObserver;

public class Rana implements Sensor {
    @Override
    public void cambioTemperatura(int temperatura) {
        if (temperatura >= 30) {
            System.out.println("Rana: Salir del agua");
        }
    }
}
