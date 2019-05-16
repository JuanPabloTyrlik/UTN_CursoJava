package clase7.EjercicioObserver;

public class Test {
    public static void main(String[] args) {
        Lago lago = new Lago();
        lago.setTemperatura(5);
        lago.setTemperatura(10);
        lago.setTemperatura(15);
        lago.setTemperatura(25);
        lago.setTemperatura(30);
        lago.setTemperatura(50);
    }
}
