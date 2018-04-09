package responsibility;

public abstract class Handler {

    protected Handler handler;

    protected void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(int request);

}
