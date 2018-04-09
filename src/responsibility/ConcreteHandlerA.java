package responsibility;

public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request <= 10) {
            System.out.println("A handle " + request);
        } else if (handler != null){
            this.handler.handleRequest(request);
        }
    }

}
