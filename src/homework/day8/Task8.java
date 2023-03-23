package homework.day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {

        Integer[] number = {3342, 34, 79, 23426, 68, 1324, 55, 7699};
        List<Integer> numbers = Arrays.asList(number);
        int count = 0;

        for (Integer number1 : numbers) {
            System.out.print(number1 + "\n");
        }

        for (Integer number1 : numbers) {
            count += number1;
        }
        System.out.print(count + "\n");

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(i + ":" + numbers.get(i) + " ");
        }

        Collections.reverse(numbers);

        System.out.print("\n");

        for (Integer number1 : numbers) {
            System.out.print(number1 + " ");
        }
    }
}
