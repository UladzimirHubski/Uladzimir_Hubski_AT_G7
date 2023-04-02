package homework.day9;

import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.filter(x->x.toString(x).contains("3")).forEach(System.out::println);
    }
}
