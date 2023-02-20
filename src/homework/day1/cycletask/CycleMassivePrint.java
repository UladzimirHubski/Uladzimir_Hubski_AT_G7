package homework.day1.cycletask;

public class CycleMassivePrint {
    CycleMassive cycleMassive = new CycleMassive();

    public void arrayPrint() {
        cycleMassive.setArray();
        for (int i = 0; i < cycleMassive.array.length; i++) {
            System.out.print(cycleMassive.array[i]);

        }
    }
}

