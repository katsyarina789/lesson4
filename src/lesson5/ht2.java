package lesson5;

import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class ht2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Мама");
        list.add("мыла");
        list.add("раму");
        list.add("!");
        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2) + list.get(3));
        System.out.println(toUpperCase(list.get(0) + " " + list.get(1) + " " + list.get(2) + list.get(3)));


        //Прочитала еще про  такой метод выведения, но не знаю, насколько он верный
        //list.forEach(System.out::print);
    }
}
