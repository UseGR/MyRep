package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(int radius , String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }

    public String getColor() {
        return super.getColor();
    }

}
