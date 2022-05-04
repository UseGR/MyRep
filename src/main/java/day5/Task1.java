package day5;
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Solaris");
        car.setColour("White");
        car.setManufactureYear(2019);
        System.out.println(car.getModel());
        System.out.println(car.getColour());
        System.out.println(car.getManufactureYear());
    }
}