package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class ListText {
    public static void main(String[] args) {
        String text = "мама отмывала  раму мыла";
        List<String> arrayIn = new ArrayList<>();
        String[] textArray = text.split(" ");

//        Collections.addAll(arrayIn, textArray); как вариант из предложения идеи

        for (String item : textArray) {
            arrayIn.add(item);
        }

        for (String item : arrayIn) {
            System.out.print(item + "\n");
        }

        System.out.println(" ");

        for (int i = 0; i < arrayIn.size(); i++) {
            System.out.print(arrayIn.get(i) + "\n");
        }
    }
}

