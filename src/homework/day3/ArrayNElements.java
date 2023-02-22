package homework.day3;

import java.util.Arrays;
import java.util.Random;

public class ArrayNElements {

    public static void main(String[] args) {


        new ArrayNElements(5, 3).createArray();

    }

    private int arrayL; //Input for Array length
    private int n; //Input for n - element

    public int[] array; // наш массив


    public ArrayNElements(int arrayL, int n) {
        this.arrayL = arrayL;
        this.n = n - 1;
    }


    private int[] createArray() {
        int[] array = new int[arrayL];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);// заполнение массива
            System.out.print(array[i] + " ");// вывод всех значений массива
        }
        System.out.println("\n<------------------->");
        return array;
    }
}


//TBD

//    public int nArray() {
//        int[] array1 = array;
//        for (int a = 0 + n; a < array1.length; a = a + n) {
//            System.out.print(array1[a] + "  ");
//        }
//
//
//        float sum = 0;
//        for (int a : array1) {
//            sum += a;
//        }
//        System.out.print(sum + " sum elements");// вывод всех значений массива
//        System.out.println("\n<------------------->");
//           return nArray();
//    }
//
//
//          }



//        float average = 0; // можно и без него т.к.  значения в массиве int
//        average = sum / array.length; // можно и без него т.к.  значения в массиве int
//        System.out.println("Average value is: " + average);// среднее значение





