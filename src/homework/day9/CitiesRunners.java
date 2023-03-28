package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CitiesRunners {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
        System.out.println(cities.stream().flatMap((s -> Arrays.stream(s.split("")))).count());
    }
}
