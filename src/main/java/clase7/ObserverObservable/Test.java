package clase7.ObserverObservable;

public class Test {
    //Realizar alguno de los ejercicios anteriores usando ObserverObservable
    //Guia: https://www.baeldung.com/java-observer-pattern

    public static void main(String[] args) {
        Lago observable = new Lago();
        Pato observer = new Pato();

        observable.addObserver(observer);
        observable.setTemp(0);
        observable.setTemp(50);
    }
}
