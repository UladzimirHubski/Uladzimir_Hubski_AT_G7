package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String[] figure = {"Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"};
        List<String> figures = Arrays.asList(figure);
        int count = 0;

        BufferedWriter out = new BufferedWriter(new FileWriter("figure.txt"));
        for (String i : figures) {
            out.write(i + "-");
        }
        out.close();

        for (String syllableCount : figures) {
            if (!syllableCount.contains("и")) {
                count++;
            }
        }

        System.out.print(count + "\n");

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(i + ":" + figures.get(i) + " ");
        }
        figures.set(3, "Треугольник");

        System.out.println("\n");

        for (String i : figures) {
            System.out.print(i + " ");
        }
    }
}