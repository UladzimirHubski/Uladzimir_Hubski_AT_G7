package homework.day1.cycletask;

import java.util.Arrays;

public class CycleMassivePrint {

CycleTaskRunner cycleTaskRunner = new CycleTaskRunner();
    CycleMassive cycleMassive = new CycleMassive();


    public void cyclePrint() {

        System.out.println(Arrays.toString(cycleMassive.getArray()));

    }
}
