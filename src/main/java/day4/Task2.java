package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
<<<<<<< HEAD
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
=======
        int[] arr = new int[10];
        int minElement = 10000;
        int maxElement = 0;
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        for (int i : arr){
            if (minElement >= i)
                minElement = i;
            if (maxElement <= i)
                maxElement = i;
            if (i % 10 == 0) {
                counter++;
                sum += i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Smallest value of array is: " + minElement);
        System.out.println("Biggest value of array is: " + maxElement);
        System.out.println("Number of elements with 0 at the end: " + counter);
        System.out.println("Summary of elements with 0 at the end: " + sum);

>>>>>>> 1ce4235 (tasks from day1 to day4 are decided)
    }
}
