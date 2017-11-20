package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<Observer>();
    int state;

    public int getState() {
        return state;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    private void notifyAllObserver() {
        for (Observer ob : observers) {
            ob.update();
        }
    }
}
