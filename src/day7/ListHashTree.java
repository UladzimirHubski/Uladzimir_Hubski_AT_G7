package day7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListHashTree {
    static public void main(String[] args) {
        Set<String> array1 = new HashSet<>();
        Set<String> array2 = new TreeSet<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            array1.add("мама" + i);
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);

        t1 = System.currentTimeMillis();
        for (int a = 0; a < 10000000; a++) {
            array2.add("мама" + a);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);
    }
}
