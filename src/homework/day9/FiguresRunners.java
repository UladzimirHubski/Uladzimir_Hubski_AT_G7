package homework.day9;

import java.util.stream.Stream;

public class FiguresRunners {
    public static void main(String[] args) {
        Stream<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        figures.mapToInt(String::length).filter(s -> s > 4).forEach(System.out::println);
    }
}
