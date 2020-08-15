//import java.util.Optional;
import java.util.stream.Stream;

class StreamFindOperation {

  public static void main(String[] args) {

    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    Stream<String> infinite = Stream.generate(() -> "chimp");

    s.findAny().ifPresent(System.out::println);        // monkey (usually)
    infinite.findAny().ifPresent(System.out::println); // chimp

  }

}
