package CycleTask;

import java.util.Random;

public class CycleMassive {

    public int array [] = new int[6];


        Random random = new Random();

        public void setArray (){
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(7);// заполнение массива
                //System.out.println(array[i]);// вывод всех значений массива
            }
        }

        public int[] getArray () {
            return array;

        }

}

//- бесполезный конструктор, который ты не используешь
//        - бесполезный аргумент в методе setArray, который ты не используешь


//- создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)