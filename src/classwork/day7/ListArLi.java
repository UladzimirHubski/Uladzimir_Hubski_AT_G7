package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListArLi {
    static public void main(String[] args) {
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new LinkedList<>();
        List<Double> array3 = new LinkedList<>();


        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            array1.add("1");
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);

        t1 = System.currentTimeMillis();
        for (int a = 0; a < 10000000; a++) {
            array2.add("1");
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);


        t1 = System.currentTimeMillis();
        for (int a = 0; a < 10000000; a++) {
            array3.add(1.1321231132321321321 / 0.121341651);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(t2);


    }
}
