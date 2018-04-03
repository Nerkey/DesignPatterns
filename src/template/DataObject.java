package template;

public abstract class DataObject {

    abstract void connect();

    abstract void select();

    abstract void process();

    abstract void disconnect();

    public void run() {
        this.connect();
        this.select();
        this.process();
        this.disconnect();
    }
}
