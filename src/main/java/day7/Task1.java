package day7;
public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2022, 30, 5000);
        Airplane airplane2 = new Airplane("SSJ", 2020, 25, 1500);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}