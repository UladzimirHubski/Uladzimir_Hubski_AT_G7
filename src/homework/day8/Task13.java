package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {

        List<Water> waters = Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));

        for (Water water : waters) {
            System.out.println(water.getColor() + "-" + water.getSmell());
        }
    }
}
