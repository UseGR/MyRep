package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.height = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public String getColor() {
        return super.getColor();
    }
}
