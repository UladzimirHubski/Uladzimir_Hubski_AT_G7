package classwork.day8.task1;


import java.util.Arrays;
import java.util.List;

public class PersonFilter {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN), new Person("Катя", 28, Person.Sex.WOMEN), new Person("Вова", 24, Person.Sex.MAN), new Person("Маша", 38, Person.Sex.WOMEN), new Person("Роман Петрович", 72, Person.Sex.MAN));

        int count = 0;

        for (Person person : people) {
            if ((person.sex == Person.Sex.WOMEN && person.age > 18 && person.age < 55) || (person.sex == Person.Sex.MAN && person.age > 18 && person.age < 60)) {
                count++;
            }
        }
        System.out.println(count);

        long c = people.stream().filter(person -> (person.sex == Person.Sex.WOMEN && person.age > 18 && person.age < 55) || (person.sex == Person.Sex.MAN && person.age > 18 && person.age < 60)).count();
        System.out.println(c);



    }
}

