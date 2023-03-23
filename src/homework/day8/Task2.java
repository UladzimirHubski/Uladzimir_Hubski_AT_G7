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

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("figure.txt"));
            for (String fig : figures) {
                out.write(fig + "-");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }

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

        for (String fig : figures) {
            System.out.print(fig + " ");
        }
    }
}