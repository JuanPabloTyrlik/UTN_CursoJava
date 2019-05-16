package clase7.PropertyChangeListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pato implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ((int)evt.getNewValue() <= 15) {
            System.out.println("Pato: Nadar");
        } else {
            if ((int)evt.getNewValue() >= 30) {
                System.out.println("Pato: Volar");
            }
        }
    }
}
