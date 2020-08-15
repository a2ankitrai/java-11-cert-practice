import java.util.stream.Stream;
import java.util.Optional;

class StreamTerminalOps {

    public static void main(String[] args) {

      Stream<String> s = Stream.of("monkey", "gorilla", "bonobo", "ape", "cat");

      // count
      // System.out.println(s.count());   // 3
      // System.out.println("----------------------------");

      Optional<String> min = s.min((s1,s2) -> s1.length() - s2.length());
      min.ifPresent(System.out::println);
      System.out.println("----------------------------");

      Stream<String> stream2 = Stream.of("ape","ape","ape");
      Optional<String> min2 = stream2.min((s1,s2) -> s1.length() - s2.length());
      min2.ifPresent(System.out::println);

      System.out.println("----------------------------");

      Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
      System.out.println(minEmpty.isPresent()); // false

    }
}
