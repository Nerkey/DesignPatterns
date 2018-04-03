package strategy;

import java.util.ArrayList;
import java.util.List;

public class Context {

    private List<Integer> list = new ArrayList<>();

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        this.strategy.sort(list);
        this.display();
    }

    public void add(int i) {
        list.add(i);
    }

    private void display() {
        list.forEach(System.out::println);
    }
}
