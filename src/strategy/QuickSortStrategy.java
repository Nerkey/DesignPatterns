package strategy;

import java.util.Comparator;
import java.util.List;

public class QuickSortStrategy implements Strategy {
    @Override
    public void sort(List<Integer> list) {
        list.sort(Comparator.comparingInt(o -> o));
        System.out.println("Quick");
    }
}
