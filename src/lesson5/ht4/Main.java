package lesson5.ht4;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Betty", "Fish");
        Fish fish1 = new Fish("Olly");

        System.out.println(person1);
        System.out.println(fish1);

        fish1.AnyAnimalCanPlay();

    }
}