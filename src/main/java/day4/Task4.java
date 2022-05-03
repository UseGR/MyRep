package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int idx = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length-2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                idx = i;
            }

        }
        System.out.println("Сумма тройки: " + maxSum);
        System.out.println("Индекс первого элемента тройки: " + idx);
    }
}
=======
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        System.out.println(Arrays.toString(array));

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for(int j = i; j < i + 3; j++){
                sum += array[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIdx);
    }
}

>>>>>>> 1ce4235 (tasks from day1 to day4 are decided)
