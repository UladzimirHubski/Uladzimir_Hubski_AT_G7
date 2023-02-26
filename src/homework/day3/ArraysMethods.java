package homework.day3;

public class ArraysMethods {

    public void arraySumN(int n, int[] array) {
        int sum = 0;
        for (int a = n - 1; a < array.length; a = a + n) {
            sum += array[a];
        }
        System.out.print(sum + "\n");
    }

    public void returnArray(int n, int[] array) {
        int newlength = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] > n) {
                newlength++;
            }
        }
        int[] array1 = new int[]{array[newlength]};
        for (int b = 0; b < array1.length; b++) {
            System.out.print(array1[b]);
        }
    }

    public void arrayMonth(int[] array) {
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] % 2 != 0) {
                sum += array[a];
            }
        }
        System.out.println(sum + "\n");
    }

    public void printCow() {
        System.out.print("\t   ^__^\n" +
                "\t  (oo)\\\\_______\n" +
                "\t (__)\\ ) \\/\\  \\\n" +
                "\t      ||----w |\\\n" +
                "\t      ||     ||");
    }
}







