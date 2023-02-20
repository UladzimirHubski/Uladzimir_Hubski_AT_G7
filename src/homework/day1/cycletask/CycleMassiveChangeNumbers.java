package homework.day1.cycletask;

import java.util.Arrays;

public class CycleMassiveChangeNumbers {

    CycleMassive cycleMassive = new CycleMassive();
    static int x;

    public void arrayChangeNumbers() {

        cycleMassive.setArray();

        System.out.println(Arrays.toString(cycleMassive.array) + " Our array");

        x = cycleMassive.array[0];
        cycleMassive.array[0] = cycleMassive.array[cycleMassive.array.length - 1];
        cycleMassive.array[cycleMassive.array.length - 1] = x;


        for (int i = 0; i < cycleMassive.array.length; i++) {
            System.out.print(cycleMassive.array[i]);
        }
    }

}
