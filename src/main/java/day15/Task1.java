package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    File input = new File("missingShoes.txt");
        File output = new File("shoes.txt"); //пришлось создать файл shoes с расширением txt, а не csv, потомучто среда разработки почему то не читала из расширения csv
        try {
            PrintWriter pw = new PrintWriter(input);
            Scanner scanner = new Scanner(output);
            while(scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] array = s.split(";");

                if (array.length != 3)
                    throw new Exception();


                if (Integer.parseInt(array[2]) == 0)
                    pw.println(s);

            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

