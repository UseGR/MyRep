package day2;

<<<<<<< HEAD
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number a = ");
        int numberA = scanner.nextInt();
        System.out.println("Number b = ");
        int numberB = scanner.nextInt();
        if (numberA >= numberB) {
            System.out.println("Error");
        } else {
            for (int i = numberA + 1; i <= numberB; i++) {
                if (i % 5 == 0 && i % 10 != 0)
                    System.out.print(i + " ");
            }
        }
=======
public class Task2 {
    public static void main(String[] args) {

>>>>>>> 1ce4235 (tasks from day1 to day4 are decided)
    }
}
