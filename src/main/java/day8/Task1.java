package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i <= 20000; i++) {
            s1 = s1 + " " + i;
        }
        System.out.print(s1);
        long stopTime1 = System.currentTimeMillis();
        System.out.println();
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long stopTime2 = System.currentTimeMillis();

        System.out.println("--------------------------");
        System.out.println("Время выполнения программы через конкатенацию строк: " + (stopTime1 - startTime1) + " мс");
        System.out.println("Время выполнения программы через StringBuilder: " + (stopTime2 - startTime2) + " мс");

    }
}
