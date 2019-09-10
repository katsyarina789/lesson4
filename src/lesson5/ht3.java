package lesson5;

import java.util.HashSet;

public class ht3 {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        int x = 0;
        int border = (int)(Math.random() * 300);
        for(int i = 0; i < 10; i++) {
            x = (int) (Math.random() * 3_00);
            set.add(x);
            if (x < border) {
                set.remove(x);
        }
            System.out.println(set);
    }}
}
