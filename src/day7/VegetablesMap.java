package day7;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.net.http.common.Utils.close;

public class VegetablesMap {
    static public void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        int count = 0;

        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String i : vegetables) {
            System.out.print(i + " ");
        }
        System.out.print("\n<---------------->\n");

        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                count++;
            }
        }
        System.out.print(count);

        System.out.print("\n<---------------->\n");

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(i + ":" +vegetables.get(i) + " ");
        }

        System.out.print("\n<---------------->\n");
        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.printf(vegetables.get(i) + " ").println();

        }
    }

}
