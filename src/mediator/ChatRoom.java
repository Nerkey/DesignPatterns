package mediator;

import java.util.Hashtable;

/**
 * 具体中介者
 */
public class ChatRoom implements IChatRoom {

    private Hashtable participants = new Hashtable();

    @Override
    public void register(Participant participant) {
        if (null == participants.get(participant.name)) {
            participants.put(participant.name, participant);
            participant.setChatRoom(this);
        }
    }

    @Override
    public void send(String from, String to, String message) {
        Participant participant = (Participant) participants.get(to);
        if (null != participant) {
            participant.receive(from, message);
        }
    }
}
