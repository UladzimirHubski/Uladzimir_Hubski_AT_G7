package homework.day1.cycletask;

public class CycleMassiveReverseOrder {

    CycleMassive cycleMassive = new CycleMassive();

    public void cycleArrayRevers() {

        cycleMassive.setArray();
        for (int i = cycleMassive.array.length - 1; i >= 0; i--) {
            cycleMassive.array[i] = cycleMassive.array[i] * cycleMassive.array[i];
            System.out.print(cycleMassive.array[i] + " ");
        }
    }

}


