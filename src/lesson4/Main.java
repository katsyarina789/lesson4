package lesson4;

public class Main {
    public static void main(String[] args) {
        Fridge fridge1 = new Fridge(82, 59.5, 201, 69, "Plastic", 4);
        System.out.printf("Размеры шкафа: %s (м), материал: %s, вес: %.2f кг\n", fridge1.getDimensions(), fridge1.getMaterial(), fridge1.getWeight());
            }

}
