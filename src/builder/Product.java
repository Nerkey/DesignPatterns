package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> list = new ArrayList<>();

    public void add(String content) {
        list.add(content);
    }

    public void show() {
        System.out.println("Display Product: ");
        list.forEach(System.out::println);
    }

}
