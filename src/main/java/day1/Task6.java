package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 3;
        int counter = 1;
        while (counter <= 9) {
            System.out.println(counter + " x " + k + " = " + k*counter);
            counter++;
        }
        System.out.println("-------------------");
        for (counter = 1; counter <= 9; counter++) {
            System.out.println(counter + " x " + k + " = " + k*counter);
        }

    }
}
