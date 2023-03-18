package classwork.day3;

public class ObjectContainer {
    Object[] array = new Object[10];
    int ePos = 0;

    public void add(Object incoming) {
        if (ePos < array.length) {
            array[ePos++] = incoming;
        }
    }

    public Object removeLast() {
        Object remObj = null;
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

