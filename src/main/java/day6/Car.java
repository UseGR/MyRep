package day6;
public class Car {
    private String model;
    private String colour;
    private int manufactureYear;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getManufactureYear() {
        return manufactureYear;
    }
    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    public void info() { System.out.println("Это автомобиль"); }
    public void yearDifference(int inputYear) {
        System.out.println("Разница: " + Math.abs(inputYear-manufactureYear));
    }
}