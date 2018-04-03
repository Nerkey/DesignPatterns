package strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        context.add(1);
        context.add(9);
        context.add(-3);
        context.add(-1);

        context.setStrategy(new BubbleSortStrategy());
        context.sort();

        context.setStrategy(new QuickSortStrategy());
        context.sort();
    }

}
