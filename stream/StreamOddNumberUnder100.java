import java.util.stream.Stream;

class StreamOddNumberUnder100 {

  public static void main(String[] args) {
      Stream<Integer> oddNumberUnder100 =

        Stream.iterate(1,
          i -> i < 100,
          i -> i+2
        );

      oddNumberUnder100.forEach(System.out::println);
  }
}
