package clase7.PropertyChangeListener;

public class Test {
    public static void main(String[] args) {
        Lago observable = new Lago();
        Pato observer = new Pato();

        observable.addPropertyChangeListener(observer);
        observable.setTemp(0);
        observable.setTemp(10);
        observable.setTemp(50);
    }
}
