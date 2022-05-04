package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Delimoe: ");
            double delim = scanner.nextDouble();
            System.out.println("Delitel: ");
            double delit = scanner.nextDouble();

            if (delit == 0)
                break;
            else{
                double div = delim/delit;
                System.out.println(div);
            }
        }
    }
}
