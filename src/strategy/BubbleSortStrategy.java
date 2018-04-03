package strategy;

import java.util.List;

public class BubbleSortStrategy implements Strategy {

    @Override
    public void sort(List<Integer> list) {
        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }

        System.out.println("Bubble");
    }
}
