package task23;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("BMW");
        list.add("Mercedes");
        list.add("BYD");
        list.add("Tesla");

        System.out.println(list);
        list.add(2,"Lada");

        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
