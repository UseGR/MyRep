package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList (File file) throws Exception {
        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] string = line.split(" ");
                for (int i = 1; i < string.length; i++) {
                    if (Integer.parseInt(string[1]) < 0) {
                        throw new Exception("Некорректный входной файл");
                    } else {
                        personList.add(new Person(string[0], Integer.parseInt(string[1])));
                    }
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return personList;
    }
}
