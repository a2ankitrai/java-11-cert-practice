//import java.util.Optional;
import java.util.stream.Stream;
import java.util.List;
import java.util.function.Supplier;

class StreamFindOperation {

  public static void main(String[] args) {

    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    Stream<String> infinite = Stream.generate(() -> "chimp");

    s.findAny().ifPresent(System.out::println);        // monkey (usually)
    infinite.findAny().ifPresent(System.out::println); // chimp

    System.out.println("-----------");

    List<String> list = List.of("monkey", "gorilla", "bonobo");
    Supplier<String> stringSupplier = () -> "chimp";

    Stream<String> s2 = list.stream();
    Stream<String> infinite2 = Stream.generate(stringSupplier);

    s2.findFirst().ifPresent(System.out::println);        // monkey (usually)
    infinite2.findFirst().ifPresent(System.out::println); // chimp


  }

}
