package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        String[] bird = {"Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"};
        List<String> birds = Arrays.asList(bird);
        int count = 0;
        char[] wordsR = {'а', 'я', 'у', 'ю', 'о', 'е', 'ё', 'э', 'и', 'ы'};

        for (String i : birds) {
            System.out.print("--" + i + "--\n");
        }

//TBD
//        for (String syllableCount : birds) {
//            if (syllableCount.matches("[wordsR]+")) {
//                count++;
//            }
//        }
//        System.out.print(count + "\n");

            for (int i = 0; i < birds.size(); i++) {
                System.out.print(i + ":" + birds.get(i) + " ");
            }

        birds.set(3, "Синица");

        System.out.println("\n");

        for (String i : birds) {
            System.out.print(i + " ");
        }
    }
}
