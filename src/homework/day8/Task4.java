package homework.day8;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
        List<String> cars = new ArrayList<>();

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"));
        for (String car : cars) {
            out.write("-\"" + car + "\"\n");
        }
        out.close();

        cars.removeIf(s -> s.length() > 4);

        for (String i : cars) {
            System.out.print(i + " ");
        }
    }
}