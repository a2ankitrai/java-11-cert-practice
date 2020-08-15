import java.util.stream.Stream;
import java.util.Optional;

class StreamTest {

  public static void main(String[] args) {

    Stream<Double> random = Stream.generate(Math::random).limit(10);
    Stream<Integer> oddStream = Stream.iterate(1,n -> n+2).limit(10);

    random.forEach(System.out::println);
    oddStream.forEach(System.out::println);


    Stream<Integer> oddInfiniteStream = Stream.iterate(1,n -> n+2);
    Optional<Integer> minEmpty = oddInfiniteStream.min((s1, s2) -> 0);
    // hangs on infinite stream
    // System.out.println(minEmpty.isPresent());

  }
}
