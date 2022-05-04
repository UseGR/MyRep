package day6;
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike("Ducatti", "Black", 2019);
        car.setModel("Solaris");
        car.setColour("White");
        car.setManufactureYear(2020);
        motorbike.info();
        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColour());
        System.out.println(motorbike.getManufactureYear());
        motorbike.yearDifference(2025);
        car.info();
        System.out.println(car.getModel());
        System.out.println(car.getColour());
        System.out.println(car.getManufactureYear());
        car.yearDifference(2016);
    }
}