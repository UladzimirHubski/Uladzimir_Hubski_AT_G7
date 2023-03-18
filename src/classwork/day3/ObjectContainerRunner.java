package classwork.day3;

public class ObjectContainerRunner {
    public static void main(String[] args) {
        ObjectContainer addElement = new ObjectContainer();
        for (int i = 0; i < 10; i++) {
            addElement.add(i);

        }

        for (int i = 0; i < 10; i++) {
            System.out.print("value:" + addElement.removeLast() + "\n");
        }
    }
}
