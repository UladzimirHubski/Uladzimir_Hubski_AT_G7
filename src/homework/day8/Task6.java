package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        String[] bird = {"Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"};
        List<String> birds = Arrays.asList(bird);
        int count = 0;

        for (String bird1 : birds) {
            System.out.print("--" + bird1 + "--\n");
        }

        for (String syllableCount : birds) {
            if (syllableCount.matches("((.*)[аяуюоеёэиы](.*)){2,}")) {
                count++;
            }
        }
        System.out.print(count + "\n");

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(i + ":" + birds.get(i) + " ");
        }

        birds.set(3, "Синица");

        System.out.print("\n");

        for (String bird1 : birds) {
            System.out.print(bird1 + " ");
        }
    }
}
