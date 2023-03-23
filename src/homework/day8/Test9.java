package homework.day8;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.floor;

public class Test9 {
    public static void main(String[] args) {

        Double[] number = {33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9};
        List<Double> numbers = Arrays.asList(number);
        double count = 0;
        double dotcount = 0;

        for (double number1 : numbers) {
            System.out.print(number1 + " ");
        }
        System.out.println();

        for (double doubleN : numbers) {
            count = count + doubleN;
        }
        System.out.println(count);

        for (double number1 : numbers) {
            double mybouble = floor(number1);
            double result = number1 - mybouble;
            dotcount += result;
        }
        System.out.println(dotcount);

        for (int i = 0; i < numbers.size(); i++) {
            double mainnumber = floor(numbers.get(i));
            System.out.print(mainnumber + " ");
        }
    }
}
