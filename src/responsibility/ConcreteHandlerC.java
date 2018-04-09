package responsibility;

public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 21 && request <= 30) {
            System.out.println("C handle " + request);
        } else if (handler != null) {
            handler.handleRequest(request);
        }
    }
}
