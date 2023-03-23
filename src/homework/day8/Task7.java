package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        int count = 0;

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }

        for (String syllableCount : elements) {
            if (syllableCount.contains("-")|| syllableCount.contains(" ")) {
                count++;
            }
        }
        System.out.print("\n" + count + "\n");

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(i + ":" + elements.get(i) + " ");
        }

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        System.out.print("\n");
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
