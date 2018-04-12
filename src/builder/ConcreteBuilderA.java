package builder;

public class ConcreteBuilderA extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("part a");
    }

    @Override
    public void buildPartB() {
        product.add("part b");
    }

    @Override
    public Product getResult() {
        return this.product;
    }
}
