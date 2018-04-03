package iterator;

public class Client {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.set(0, "Item A");
        aggregate.set(1, "Item B");
        aggregate.set(2, "Item C");
        aggregate.set(3, "Item D");

        MyIterator iterator = aggregate.createIterator();

        System.out.println(iterator.first());

        System.out.println("---------------------");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
