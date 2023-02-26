package homework.day3;

public class ArrayRunner {

    public static void main(String[] args) {
        ArraysMethods arraysMethods = new ArraysMethods();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("\n<--------SumN-------->\n");
        arraysMethods.arraySumN(3, array);
        System.out.println("\n<--------returnArray-------->\n");
        arraysMethods.returnArray(8,array);
        System.out.println("\n<--------arrayMonth-------->\n");
        arraysMethods.arrayMonth(array);
        System.out.println("\n<--------printCow-------->\n");
        arraysMethods.printCow();
    }
}
