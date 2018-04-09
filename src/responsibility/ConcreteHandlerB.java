package responsibility;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 11 && request <= 20) {
            System.out.println("B handle " + request);
        } else if (handler != null) {
            handler.handleRequest(request);
        }
    }
}
