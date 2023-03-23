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


        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"));
            for (String car : cars) {
                out.write("-\"" + car + "\"\n");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i);
                i--;
            }
        }

        for (String i : cars) {
            System.out.print(i + " ");
        }
    }
}