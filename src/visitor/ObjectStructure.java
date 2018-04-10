package visitor;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ObjectStructure {

    private ArrayList<Element> list = new ArrayList<>();

    public void attach(Element element) {
        list.add(element);
    }

    public void detach(Element element) {
        list.remove(element);
    }

    public void accept(Visitor visitor) {
        list.forEach(element -> element.accept(visitor));
    }

}
