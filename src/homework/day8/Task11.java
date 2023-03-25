package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.print("\n");

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.print("\n");

        int counter = 0;
        for (Bubble bubble : bubbles) {
            counter += bubble.getVolume();
        }
        System.out.print(counter + "\n");

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}

