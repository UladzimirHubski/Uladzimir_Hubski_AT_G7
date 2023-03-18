package classwork.day4;

public class GenericContainer<Z> {
    private Z[] array = (Z[]) new Object[10];
    private Z[] array1 = (Z[]) new Object[10];
    private int ePos = 0;

    public void add(Z incoming) {
        if (ePos < array.length) {
            array[ePos++] = incoming;
        }
    }

    public void add1(Z incoming) {
        if (ePos < array.length) {
            array[ePos++] = incoming;
        }
    }

    public Z removeLast() {
        Z remObj = null;
        if (ePos != 0) {
            remObj = array[ePos - 1];
            array[ePos-- - 1] = null;
        }
        return remObj;
    }

    public boolean isEmpty() {
        return ePos == 0;
    }
}
