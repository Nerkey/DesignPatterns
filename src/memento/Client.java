package memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.name = "张三";
        originator.phone = "123456";
        originator.budget = 1000;

        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.saveMemento());

        originator.name = "李四";
        originator.phone = "654321";
        originator.budget = 2000;

        originator.show();

        originator.restoreMemento(caretaker.getMemento());

        originator.show();
    }

}
