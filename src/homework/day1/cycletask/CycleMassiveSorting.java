package homework.day1.cycletask;


import java.util.Arrays;

public class CycleMassiveSorting {

    CycleMassive cycleMassive = new CycleMassive();

    public void arraySorting() {
        cycleMassive.setArray();
        System.out.println(Arrays.toString(cycleMassive.array) + " Our array");
        System.out.println("Sorted Array:");
        for (int i = 0; i < cycleMassive.array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cycleMassive.array.length; j++) {
                if (cycleMassive.array[j] < cycleMassive.array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = cycleMassive.array[i];
            cycleMassive.array[i] = cycleMassive.array[minIndex];
            cycleMassive.array[minIndex] = temp;
        }
        for (int i = 0; i < cycleMassive.array.length; i++) {
            System.out.print(cycleMassive.array[i] + "");
        }
        System.out.println();
        int max = cycleMassive.array.length - 1;
        System.out.println("Array in descending order:");
        for (int i = max; i >= 0; i--) {
            System.out.print(cycleMassive.array[i]);


        }

    }
}
