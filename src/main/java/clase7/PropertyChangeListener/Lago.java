package clase7.PropertyChangeListener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Lago {
    private PropertyChangeSupport support;

    public Lago() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setTemp(int temp) {
        support.firePropertyChange("temp", temp - 1, temp);
    }

}
