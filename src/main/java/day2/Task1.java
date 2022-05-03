package day2;

<<<<<<< HEAD
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of floors in building: ");
        int numberOfFloors = scanner.nextInt();
        if (numberOfFloors < 0) {
            System.out.println("Error");
        } else if (numberOfFloors >= 1 && numberOfFloors <= 4) {
            System.out.println("Low-rise building");
        } else if (numberOfFloors >= 5 && numberOfFloors <= 8) {
               System.out.println("Mid-rise building");
        } else {
            System.out.println("Multi-storey building");
        }
=======
public class Task1 {
    public static void main(String[] args) {

>>>>>>> 1ce4235 (tasks from day1 to day4 are decided)
    }
}
