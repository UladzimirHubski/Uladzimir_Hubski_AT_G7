package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        int count = 0;

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String i : countries) {
            System.out.print(i + ", ");
        }

        for (String syllableCount : countries) {
            if (syllableCount.length() < 7) {
                count++;
            }
        }
        System.out.print("\n" + count + "\n");

        for (int i = 0; i < countries.size(); i++) {
            System.out.print(i + ":" + countries.get(i) + "\n");
        }
    }
}