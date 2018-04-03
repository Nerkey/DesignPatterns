package iterator;

public class ConcreteMyIterator extends MyIterator {

    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteMyIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        return aggregate.get(current++);
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }

    @Override
    public boolean hasNext() {
        return current != aggregate.count();
    }
}
