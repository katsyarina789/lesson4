package lesson5;

import java.util.ArrayList;

public class ht1 {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = -50; i < 50; i++) {
            list.add(i);
        }
        double average = 0;
        for (int j = 0; j < 5; j++) {
            int x = (int) (Math.random() * list.size());
            average = (x / 5.0);
        }
        System.out.println(average);
    }
}
