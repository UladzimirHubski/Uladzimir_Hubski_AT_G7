package homework.day1.cycletask;

import java.util.Random;

public class CycleMassive {


    public int[] array = new int[6];


    Random random = new Random();

    public void setArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
        }
    }


}
