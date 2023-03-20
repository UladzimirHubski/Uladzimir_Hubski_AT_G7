package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        int count = 0;

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String i : cities) {
            System.out.print(i + "\n");
        }

        for (String syllableCount : cities) {
            count += syllableCount.length();
        }
        System.out.print(count + "\n");

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(i + ":" + cities.get(i) + " ");
        }
    }
}