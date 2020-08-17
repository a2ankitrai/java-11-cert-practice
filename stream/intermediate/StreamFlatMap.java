import java.util.stream.Stream;
import java.util.List;

class StreamFlatMap {

  public static void main(String[] args) {

      List<String> zero = List.of();
      var one = List.of("Tiger");
      var two = List.of("Lion", "Zebra", "Anaconda");

      Stream<List<String>> animals = Stream.of(zero, one, two);

      animals.flatMap(m -> m.stream())
              .forEach(System.out::println);


  }
}
