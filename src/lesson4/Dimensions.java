package lesson4;

public class Dimensions {
    private double width, height, depth;
    public Dimensions(double width, double height, double depth) {

        this.width = width;
        this.height = height;
        this.depth = depth;

        this.width = width;
        this.height = height;
        this.depth = depth;

        if (width <= 0)
            this.width = 1;

        if (height <= 0)
            this.height = 1;

        if (depth <= 0)
            this.depth = 1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}
