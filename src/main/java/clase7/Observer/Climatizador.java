package clase7.Observer;

public class Climatizador implements Sensor {
    @Override
    public void cambiodeTemperatura(int tempatura) {
        if (tempatura > 24) {
            System.out.println("Prender Aire");
        } else {
            if (tempatura < 18) {
                System.out.println("Prender Estufa");
            }
        }
    }
}
