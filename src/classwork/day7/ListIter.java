package classwork.day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListIter {
    public static void main(String[] args) {
        String text = "мама отмывала раму мыла мама";
        Set<String> arrayIn = new HashSet<>();
        String[] textArray = text.split(" ");

        for (String item : textArray) {
            arrayIn.add(item);
        }

        for (String item : arrayIn) {
            System.out.print(item + "\n");
        }

        System.out.print("\n");

        Iterator<String> newIterator = arrayIn.iterator();
        while (newIterator.hasNext()) {
            System.out.print(newIterator.next() + "\n");
        }
    }
}
