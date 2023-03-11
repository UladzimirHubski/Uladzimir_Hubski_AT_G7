package homework.day5.sorting;

public class Task1_2 {

    public void printDuplicates(String text) {
        String res;
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    res = array[i];
                    System.out.println(res);
                }
            }
        }
    }

}
