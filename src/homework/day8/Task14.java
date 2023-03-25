package homework.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task14 {
    public static void main(String[] args) {

        List<Sand> sands = new ArrayList<>();

        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));

        for (Sand sand : sands) {
            System.out.print(sand.getWeigh() + " ");
        }
        System.out.print("\n");

        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        System.out.print("\n");

        Map<Integer, Sand> integerListSand = new HashMap<>();

        int key = 1;
        for (Sand sand : sands) {
            integerListSand.put(key++, sand);
        }

        for (int sandKey : integerListSand.keySet()) {
            System.out.println("Ключ : " + sandKey + " ");
        }


        for (Sand sandValues : integerListSand.values()) {
            System.out.print(sandValues.getName() + " ");
        }

        for (Map.Entry<Integer, Sand> entry : integerListSand.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
