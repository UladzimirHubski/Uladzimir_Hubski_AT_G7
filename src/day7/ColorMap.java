package day7;

import java.util.ArrayList;
import java.util.List;

public class ColorMap {
    static public void main(String[] args) {
        List<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");

        for (String i : color) {
            System.out.println(i);
        }

        color.add(2, "Pink");
        color.add(4, "Yellow");
        System.out.println("<---------------->");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
        System.out.println("<---------------->");
        System.out.printf("%s, \n %s", color.get(1), color.get(5));

    }
}
