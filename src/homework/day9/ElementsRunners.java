package homework.day9;

import java.util.stream.Stream;

public class ElementsRunners {
    public static void main(String[] args) {

        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        elements.map(element -> {
            if (element.length() % 2 == 0) {
                return String.valueOf(element.length());
            } else {
                return element.replaceAll("e", "o");
            }
        }).distinct().forEach(System.out::println);
    }
}
