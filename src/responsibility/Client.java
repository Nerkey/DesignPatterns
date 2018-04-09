package responsibility;

public class Client {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        int[] request = {1, 5, 2, 20, 22, 16, 9, 17, 25, 3};

        for (int i = 0; i < request.length; i++) {
            handlerA.handleRequest(request[i]);
        }

    }

}
