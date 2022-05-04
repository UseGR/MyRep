package day5;
public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Ducatti", "Black", 2020);
        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColour());
        System.out.println(motorbike.getManufactureYear());
    }
}