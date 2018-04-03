package observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("Receiver: " + object);
    }
}
