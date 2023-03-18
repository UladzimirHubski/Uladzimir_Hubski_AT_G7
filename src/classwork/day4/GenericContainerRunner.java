package classwork.day4;

public class GenericContainerRunner {

    public static void main(String[] args) {
        GenericContainer<Integer> addElement = new GenericContainer<>();

        for (int i = 0; i < 10; i++) {
            addElement.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("value:" + addElement.removeLast() + "\n");
        }
    }
}
