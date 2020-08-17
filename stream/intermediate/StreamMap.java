import java.util.stream.Stream;

class StreamMap {

  public static void main(String[] args) {

    Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
    s.map(String::length)
     .forEach(System.out::println);
  }
}
