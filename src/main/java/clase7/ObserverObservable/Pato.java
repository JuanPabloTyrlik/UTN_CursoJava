package clase7.ObserverObservable;

import java.util.Observable;
import java.util.Observer;

public class Pato implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if ((int) arg <= 15) {
            System.out.println("Pato: Nadar");
        } else {
            if ((int) arg >= 30) {
                System.out.println("Pato: Volar");
            }
        }
    }
}
