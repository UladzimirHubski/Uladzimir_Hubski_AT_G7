package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunners {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        Arrays.stream(birds.stream().map(s -> s.replace("о", "а")).collect(Collectors.joining("")).toLowerCase().split("б")).map(s -> s.replace("ь","")).flatMap(s -> Arrays.stream(s.split("б"))).forEach(System.out::println);
    }
}
