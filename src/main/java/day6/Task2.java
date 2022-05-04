package day6;
public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("SuperJet", 2021, 20, 1500);
        airplane.setYear(2022);
        airplane.setLength(30);
        airplane.fillUp(20);
        airplane.fillUp(30);
        airplane.info();
    }
}