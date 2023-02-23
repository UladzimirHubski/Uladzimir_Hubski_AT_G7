package homework.day1.cycletask;

public class CycleMassiveSquare {

    CycleMassive cycleMassive = new CycleMassive();

    public void cycleArraySquare() {
        cycleMassive.setArray();
        for (int i = 0; i < cycleMassive.array.length; i++) {
            cycleMassive.array[i] = cycleMassive.array[i] * cycleMassive.array[i];
            System.out.print(cycleMassive.array[i] + " ");
        }
    }
}
