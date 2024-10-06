package lambda;

import java.util.List;

public class Lambda {
    public static void execute() {
        System.out.println("=== ラムダ ===");

        List<Person> persons = List.of(
                new Person("田中", 30),
                new Person("山田", 20),
                new Person("佐藤", 40)
        );
        System.out.println("=== 名前 ===");
        persons.stream().map(Person::getName).forEach(System.out::println);
        System.out.println("=== 年齢 ===");
        persons.stream().map(Person::getAge).forEach(System.out::println);
        System.out.println("=== 30歳以上の名前 ===");
        persons.stream().filter(person -> person.getAge() >= 30).map(Person::getName).forEach(System.out::println);
    }
}
