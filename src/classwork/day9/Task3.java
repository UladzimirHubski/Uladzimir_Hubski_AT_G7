package classwork.day9;

import classwork.day8.task1.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN), new Person("Катя", 28, Person.Sex.WOMEN), new Person("Вова", 24, Person.Sex.MAN), new Person("Маша", 38, Person.Sex.WOMEN), new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split(""))).peek(System.out::println).max(String::compareTo).get());
        System.out.printf("%s", people.stream().min(Comparator.comparing(person -> person.age)).get());

    }
}
