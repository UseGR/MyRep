package day3;

<<<<<<< HEAD
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double div;
        while (counter < 4) {
            System.out.println("Delimoe");
            double delim = scanner.nextDouble();
            System.out.println("Delitel");
            double delit = scanner.nextDouble();

            if (delit == 0) {
                System.out.println("Dividing by zero");
                continue;
            }
            counter++;

            div = delim / delit;
            System.out.println(div);
        }
=======
public class Task3 {
    public static void main(String[] args) {

>>>>>>> 1ce4235 (tasks from day1 to day4 are decided)
    }
}
