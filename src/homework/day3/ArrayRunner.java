package homework.day3;

public class ArrayRunner {

    public static void main(String[] args) {
        ArraysMethods arraysMethods = new ArraysMethods();
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        arraysMethods.arraySumN(3, array);
//        arraysMethods.returnArray(1,array);
        arraysMethods.arrayMonth(array);
        arraysMethods.printCow();
    }
}
