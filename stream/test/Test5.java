import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        Stream<Person> stream = Stream.of(new Person("John"));
        stream.map(p -> p.name = "Jane").forEach(System.out::println);
    }
}


class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Whizlabs";
    }
}
