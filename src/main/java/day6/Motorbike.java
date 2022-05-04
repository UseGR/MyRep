package day6;
public class Motorbike {
    private String model;
    private String colour;
    private int manufactureYear;
    public Motorbike(String model, String colour, int manufacture_year) {
        this.model = model;
        this.colour = colour;
        this.manufactureYear = manufacture_year;
    }
    public String getModel() {
        return model;
    }
    public String getColour() {
        return colour;
    }
    public int getManufactureYear() {
        return manufactureYear;
    }
    public void info() { System.out.println("Это мотоцикл"); }
    public void yearDifference(int inputYear) {
        System.out.println("Разница: " + Math.abs(inputYear-manufactureYear));
    }
}