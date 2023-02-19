package BaseTask;

public class TrainMethodsReturn {


//    public static void main(String[] args) {
//        new TrainMethodsReturn().returnNewInt();
//        new TrainMethodsReturn().returnNewLong();
//        new TrainMethodsReturn().returnNewChar();
//        new TrainMethodsReturn().returnNewFloat();
//        new TrainMethodsReturn().returnNewDouble();
//        new TrainMethodsReturn().returnNewShort();
//        new TrainMethodsReturn().returnNewByte();
//        new TrainMethodsReturn().returnNewBoolean();
//
//
//    }


    public int returnNewInt(int returnNewInt) {
//        int returnNewInt = 6;
        System.out.println(returnNewInt * 3);

        return returnNewInt;
    }

    public long returnNewLong(long returnNewLong) {
//        long returnNewLong = 2147483647;
        System.out.println(returnNewLong - 4);
        return returnNewLong;
    }

    public char returnNewChar(char returnNewChar) {
//        char returnNewChar = 7;
        System.out.println(returnNewChar + " " + returnNewChar);
        return returnNewChar;
    }

    public float returnNewFloat(float returnNewFloat) {
//        float returnNewFloat = 30.6f;
        System.out.println(returnNewFloat / 2);
        return returnNewFloat;
    }

    public double returnNewDouble(double returnNewDouble) {
//        double returnNewDouble = 179.231;
        System.out.println(returnNewDouble + 8);
        return returnNewDouble;
    }

    public short returnNewShort(short returnNewShort) {
//        short returnNewShort = 32767;
        System.out.println(returnNewShort - 1);
        return returnNewShort;
    }

    public byte returnNewByte(byte returnNewByte) {
//        byte returnNewByte = 127;
        System.out.println(returnNewByte * 2);
        return returnNewByte;
    }

    public boolean returnNewBoolean(boolean returnNewBoolean) {
//        boolean returnNewBoolean = false;
        System.out.println(!returnNewBoolean);
        return returnNewBoolean;
    }


}


//- создать класс TrainMethodsReturn и в нем
//        -- создать метод returnNewInt, который принимает на вход целое число (int) и возвращает это число умноженное на 3
//        -- создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это число минус 4
//        -- создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таких символов
//        -- создать метод returnNewFloat, который принимает на вход дробное число (float) и возвращает это число деленное на 2
//        -- создать метод returnNewDouble, который принимает на вход дробное число (double) и возвращает это число плюс 8
//        -- создать метод returnNewShort, который принимает на вход целое число (short) и возвращает это число минус 1
//        -- создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это число умноженное на 2
//        -- создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и возвращает обратное булево
//        -- создать класс TrainMethodsReturnRunner с методом main, в котором создать обьект класса TrainMethodsReturn, и отпечатать в консоль значение, возвращаемое каждым из его методов в виде "метод <название метода> вернул " и возвращаемое значение


