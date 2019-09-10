package lesson5.ht4;

public class Bird implements ToPlay {

    String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void AnyAnimalCanPlay() {
        System.out.println(name + "is flying");
    }
}
