package homework.day3;

import java.util.Random;

public class arraysMethods {

    public static void main(String[] args) {
        new arraysMethods().array();

    }

    public void array() {

        int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40);// заполнение массива
            System.out.print("  " + array[i]);// вывод всех значений массива
        }
        System.out.println("  ");


        int n = 2;
        int[] array1 = array;
        for (int a = n; a < array1.length; a = a + n) {
            System.out.print(" " + array1[a]);// вывод всех значений массива
        }
        System.out.println("  ");


        int n1 = 15;
        int[] array2 = array;
        for (int b = 0; b < array1.length; b++) {
            if (array2[b] > n1) {
                System.out.print(" " + array2[b]);// вывод всех значений массива
            }
        }


        
    }
}

