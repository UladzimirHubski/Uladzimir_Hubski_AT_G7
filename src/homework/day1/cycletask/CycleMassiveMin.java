package homework.day1.cycletask;

import java.util.Arrays;

public class CycleMassiveMin {

    CycleMassive cycleMassive = new CycleMassive();

    public void arrayMinimum() {

        cycleMassive.setArray();

        System.out.println(Arrays.toString(cycleMassive.array) + " Our array");

        for (int i = 0; i < cycleMassive.array.length - 1; i = i + 2) {
            if (i + 1 > cycleMassive.array.length) {
                if (cycleMassive.array[i] < cycleMassive.array[0]) cycleMassive.array[0] = cycleMassive.array[i];
            }
            if (cycleMassive.array[i] > cycleMassive.array[i + 1]) {
                if (cycleMassive.array[i + 1] < cycleMassive.array[0])
                    cycleMassive.array[0] = cycleMassive.array[i + 1];
            }
            if (cycleMassive.array[i] < cycleMassive.array[i + 1]) {
                if (cycleMassive.array[i] < cycleMassive.array[0]) cycleMassive.array[0] = cycleMassive.array[i];

            }

        }
        System.out.print(" Minimum value for the above array = " + cycleMassive.array[0]);

    }

}



