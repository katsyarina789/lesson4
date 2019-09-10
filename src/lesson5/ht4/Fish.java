package lesson5.ht4;

public class Fish implements ToPlay {

    String name;

    public Fish(String name) {
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
        return "Fish{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void AnyAnimalCanPlay() {
        System.out.println(name + " is swimming");
    }
}
