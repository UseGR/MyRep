package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        File file = new File("people.txt");
        System.out.println(parseFileTOStringList(file));
    }

    public static List<String> parseFileTOStringList (File file) throws Exception {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(" ");
                if (Integer.parseInt(array[1]) < 0) {
                    throw new Exception("Некорректный входной файл");
                }else {
                    list.add(line);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return list;
    }
}
