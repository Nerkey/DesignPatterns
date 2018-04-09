package mediator;

public class Participant {

    private ChatRoom chatRoom;

    public String name;

    public Participant(String name) {
        this.name = name;
    }

    public void send(String to, String message) {
        chatRoom.send(name, to, message);
    }

    public void receive(String from, String message) {
        System.out.println("from: " + from + " message: " + message);
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
