package builder;

public class ConcreteBuilderB extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("part x");
    }

    @Override
    public void buildPartB() {
        product.add("part y");
    }

    @Override
    public Product getResult() {
        return this.product;
    }
}
