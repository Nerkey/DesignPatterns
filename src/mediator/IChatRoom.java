package mediator;

/**
 * 中介者接口
 */
public interface IChatRoom {

    void register(Participant participant);

    void send(String from, String to, String message);

}
