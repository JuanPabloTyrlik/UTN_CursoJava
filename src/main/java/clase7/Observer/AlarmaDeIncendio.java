package clase7.Observer;

public class AlarmaDeIncendio implements Sensor {
    @Override
    public void cambiodeTemperatura(int tempatura) {
        if (tempatura > 40) {
            System.out.println("Sonar Alarma");
            System.out.println("Llamar Bomberos");
        }
    }
}
