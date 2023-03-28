package homework.day9;

import java.util.stream.Stream;

public class AutoRunners {
    public static void main(String[] args) {

        Stream<String> auto = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");

        auto.distinct().filter(s -> s.contains("и")).skip(1).map(String::toUpperCase).forEach(System.out::println);

    }
}
