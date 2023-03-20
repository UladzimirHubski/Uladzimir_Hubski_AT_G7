package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        int count = 0;

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String i : butterflies) {
            System.out.print("\"" + i + "\"");
        }

        for (String syllableCount : butterflies) {
            if (syllableCount.contains("o")) {
                count++;
            }
        }

        System.out.print("\n" + count + "\n");

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(i + ":" + butterflies.get(i) + " ");
        }

        for (String i : butterflies) {
            System.out.print("\n" + i);
        }
    }
}