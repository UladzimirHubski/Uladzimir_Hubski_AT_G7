package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class NameMap {
    static public void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String i : names) {
            System.out.println(i);
        }

        names.set(2, "Оля");
        names.set(4, "Катя");
        System.out.println("<---------------->");


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("<---------------->");
        names.remove("Оля");
        names.remove(3);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
