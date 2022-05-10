package day9.Task2;

public class Triangle extends Figure {
    private int length1, length2, length3;

    public Triangle(int length1, int length2, int length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    public int getLength3() {
        return length3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.pow((p * (p - getLength1()) * (p - getLength2()) * (p - getLength3())), 0.5);
    }

    @Override
    public double perimeter() {
        return getLength1() + getLength2() + getLength3();
    }

    public String getColor() {
        return super.getColor();
    }
}
