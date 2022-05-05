package day7;
public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;
    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public int getFuel() {
        return fuel;
    }
    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    public int fillUp (int n) {
        return fuel = fuel + n;
    }

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength())
            System.out.println("Самолет фирмы " + airplane1.getManufacturer() + " длиннее самолета фирмы " + airplane2.getManufacturer());
        else if (airplane1.getLength() < airplane2.getLength())
            System.out.println("Самолет фирмы " + airplane2.getManufacturer() + " длиннее самолета фирмы " + airplane1.getManufacturer());
        else
            System.out.println("Длины самолетов равны");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getLength() {
        return length;
    }
}