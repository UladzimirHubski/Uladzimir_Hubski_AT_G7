package classwork.day7;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
    static public void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();
        String[] array = "мама мыла раму мама Null ".split(" ");

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        for (int key : words.keySet()) {
            System.out.println(key);
        }

        for (String key : words.values()) {
            System.out.println(key);
        }

        for (Map.Entry<Integer, String> key : words.entrySet()) {   //вариант 1
            System.out.println(key);
        }

        for (Map.Entry<Integer, String> key : words.entrySet()) {    //вариант 2
            System.out.println(key.getKey() + key.getValue());
        }
    }
}
