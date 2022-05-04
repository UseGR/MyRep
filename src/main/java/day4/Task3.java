package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int[][] matrix = new int[m][n];
        int currentRow = 0;
        int index = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(50);
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.print("| сумма элементов строки: " + sum);
            System.out.println();
            if (currentRow == sum) {
                currentRow = sum;
                index = i;
            }else if (currentRow < sum) {
                    currentRow = sum;
                    index = i;
                }
        }
        System.out.println("Индекс строки с наибольшей суммой элементов " + index);
    }
}
