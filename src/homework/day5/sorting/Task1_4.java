package homework.day5.sorting;

import java.util.Arrays;

public class Task1_4 {
    public void printLog(String text) {
        String[] array = text.split(" ");
        String[] array1 = new String[array.length];


        for (int i = 0; i < array.length; i++) {
            array1 = array[i].split(" ");
            //System.out.println(Arrays.toString(array));
            for (int j = 0; j < array1.length; j++) {

            }
            System.out.println(Arrays.toString(array1));
        }
    }

}

