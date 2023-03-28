package classwork.day9;

import classwork.day8.task1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN), new Person("Катя", 28, Person.Sex.WOMEN), new Person("Вова", 24, Person.Sex.MAN), new Person("Маша", 38, Person.Sex.WOMEN), new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList()));
        System.out.println(people.stream().sorted((x, y) -> {
            if (x.sex.equals(y.sex)) {
                return x.age - y.age;
            } else {
                return (x.sex.compareTo(y.sex));
            }
        }).peek(p -> System.out.println(p.name)).collect(Collectors.toList()));
    }
}
