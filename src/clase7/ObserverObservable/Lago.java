package clase7.ObserverObservable;

import java.util.Observable;

public class Lago extends Observable {

    public void setTemp(int temp) {
        setChanged();
        notifyObservers(temp);
    }
}
