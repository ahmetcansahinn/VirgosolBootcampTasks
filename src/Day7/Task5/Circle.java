package Day7.Task5;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3 * radius;
    }
}
