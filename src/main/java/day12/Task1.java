package day12;
import java.util.ArrayList;
import java.util.List;
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"Audi");
        list.add(1,"BMW");
        list.add(2,"Citroen");
        list.add(3, "Dodge");
        list.add(4,"Fiat");
        System.out.println(list);
        list.add(3,"Mercedes");
        list.remove(0);
        System.out.println(list);
        //слышал, что в больших массивах с данными эффективнее производить операцию удаления в классе LinkedList
    }
}