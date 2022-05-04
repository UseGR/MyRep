package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        System.out.println(Arrays.toString(array));
        int maxValue = 0;
        int minValue = 10000;
        int counter = 0;
        int sum = 0;
        for (int j : array) {
            if (maxValue <= j) {
                maxValue = j;
            }
            if (minValue >= j) {
                minValue = j;
            }
            if (j % 10 == 0) {
                counter++;
                sum += j;
            }
        }
        System.out.println("Максимальный элемент: " + maxValue);
        System.out.println("Минимальный элемент: " + minValue);
        System.out.println("Элементы, оканчивающиеся на 0: " + counter);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sum);
    }
}
