package day8.part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        int count = 0;

        for (String s : list) {
            if ("мама".equals(s)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());

        String text = list.stream().skip(4).findFirst().get();
        System.out.println(text);
        System.out.println();

        List<String> list1 = list.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(list1);

        List<String> list2 = list.stream().distinct().filter(s -> s.contains("м")).collect(Collectors.toList());
        System.out.println(list2);


        List<String> list3 = list.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList());
        System.out.println(list3);
    }
}

