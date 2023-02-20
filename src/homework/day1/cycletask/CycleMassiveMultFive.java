package homework.day1.cycletask;

public class CycleMassiveMultFive {

    CycleMassive cycleMassive = new CycleMassive();

    public void arrayMultFive() {
        cycleMassive.setArray();
        for (int i = 0; i < cycleMassive.array.length; i++) {
            cycleMassive.array[i] = cycleMassive.array[i] * 5;
            System.out.print(cycleMassive.array[i] + " ");

        }
    }
}









