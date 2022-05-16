package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Task16Numbers.txt");
        printResult(file);
    }
    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            double scale = Math.pow(10,3);
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            for (String s : array) {
                sum += Integer.parseInt(s);
            }
            double average = sum / (double) array.length;
            System.out.println(average + " --> " + Math.round(average * scale) / scale);  //можно использовать System.out.printf(average + " --> %.3f", average); в таком случае выведется 23,286, по заданию разделителем разрядов служит "."

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

