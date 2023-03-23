package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> noodles = Arrays.asList("Hakka", "Ramen", "Hibachi", "Schezwan");

        for (String noodle : noodles) {
            System.out.print("-" + noodle);
        }

        for (int i = 0; i < noodles.size(); i++) {
            String noodle = noodles.get(i);
            noodle = noodle.replace('a', 'o');
            noodles.set(i, noodle);
        }


        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
