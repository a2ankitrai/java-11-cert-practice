import java.util.stream.Stream;
import java.util.function.Predicate;

class StreamFilter {

    public static void main(String[] args) {

      Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
      s.filter(x -> x.startsWith("m"))
        .forEach(System.out::println); // monkey

        System.out.println("------------------");

      Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");

      Predicate<String> startsWithM = x -> x.startsWith("m");
      Predicate<String> startsWithB = x -> x.startsWith("b");

      s1.filter(startsWithM.or(startsWithB))
        .forEach(System.out::println); // monkey bonobo
    }
}
