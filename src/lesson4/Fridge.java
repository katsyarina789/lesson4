package lesson4;

public class Fridge {
    private double weight;
    private Dimensions dimensions;
    private String material;
    private FoodItems[] foodItemsInside;

    public Fridge(double weight, double width, double height, double depth, String material, int numberOfShelves) {

        this.weight = weight;
        this.dimensions = new Dimensions(width, height, depth);
        this.material = material;
        this.foodItemsInside = new FoodItems[numberOfShelves];
    }

    public Fridge(int numberOfShelves) {

        this.weight = 3 * numberOfShelves;
        this.dimensions = new Dimensions(numberOfShelves * 0.2, 3, 0.5);
        this.material = "Glass";
        this.foodItemsInside = new FoodItems[numberOfShelves];
    }

    public double getWeight() {
        return weight;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public FoodItems[] getFoodItemsInside() {
        return foodItemsInside;
    }
}