import java.util.stream.Stream;

class StreamDistinct {

    public static void main(String[] args) {

      Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
      s.distinct()
        .forEach(System.out::println);
    }
}
