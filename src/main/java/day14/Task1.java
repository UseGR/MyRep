package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        File file = new File("Test.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file)  {
        try {
            Scanner scanner = new Scanner(file);
            List<Integer> listOfElements = new ArrayList<>();
            int sum = 0;

            while(scanner.hasNextInt()) {
                listOfElements.add(scanner.nextInt());
            }
            System.out.println(listOfElements);
            if (listOfElements.size() != 10) {
                throw new Exception();
            }else {
                for (Integer element : listOfElements) {
                    sum += element;
                }
                System.out.println("Сумма элементов: "+sum);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
