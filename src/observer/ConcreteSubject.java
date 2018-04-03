package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers(Object object) {
        list.forEach(observer -> observer.update(object));
    }

    public void invoke() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            this.notifyObservers(i);
        }
    }
}
