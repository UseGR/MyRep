package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int sum = 0;
        for (int k : array) {
            if (k > 8)
                counter1++;

            if (k == 1)
                counter2++;

            if (k % 2 == 0)
                counter3++;

            if (k % 2 != 0)
                counter4++;

            sum += k;
        }
        System.out.println("Элементов больше 8: " + counter1);
        System.out.println("Элементов равных 1: " + counter2);
        System.out.println("Четных элементов: " + counter3);
        System.out.println("Нечетных элементов: " + counter4);
        System.out.println("Сумма элементов: " + sum);
=======
        Random random = new Random();
        System.out.println("Input array's length: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(10);
        }
        for (int i : array) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Array's length: " + array.length);

        int counter1 = 0;
        for (int j : array) {
            if (j > 8) {
                counter1++;
            }
        }
        System.out.println("Number of elements bigger than 8: " + counter1);

        int counter2 = 0;
        for (int j : array) {
            if (j == 1) {
                counter2++;
            }
        }
        System.out.println("Number of elements equal to 1: " + counter2);

        int counter3 = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                counter3++;
            }
        }
        System.out.println("Number of even elements: " + counter3);

        int counter4 = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                counter4++;
            }
        }
        System.out.println("Number of odd elements: " + counter4);

        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("Summary of elements: " + sum);

>>>>>>> 1ce4235 (tasks from day1 to day4 are decided)

    }
}
