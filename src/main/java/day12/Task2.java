package day12;
import java.util.ArrayList;
import java.util.List;
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillList(0,30,300,350,list);
    }
    public static void fillList(int first1, int last1, int first2, int last2, List list) {
        for (int i = first1; i <= last1; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        for (int i = first2; i <= last2; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}