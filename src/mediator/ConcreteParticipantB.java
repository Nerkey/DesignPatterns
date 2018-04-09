package mediator;

public class ConcreteParticipantB extends Participant {


    public ConcreteParticipantB(String name) {
        super(name);
    }

    @Override
    public void receive(String from, String message) {
        System.out.println("To ConcreteParticipantB");
        super.receive(from, message);
    }
}
