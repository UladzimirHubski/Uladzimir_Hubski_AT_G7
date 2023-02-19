package CycleTask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CycleTaskRunner {
    public static void main(String[] args) {
        CycleMassive cycleMassive = new CycleMassive();
        cycleMassive.setArray();


        CycleMassivePrint cycleMassivePrint = new CycleMassivePrint();
        cycleMassivePrint.cyclePrint();

     System.out.println(Arrays.toString(cycleMassive.getArray()) + " контроль");
//

    }


}
