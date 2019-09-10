package lesson5.ht4;

public class Cat implements ToPlay {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void AnyAnimalCanPlay() {
        System.out.println(name + " is running");
    }
}
