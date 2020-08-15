import java.util.stream.Stream;

class StreamGenerateMethodTest {

    public static void main(String[] args) {

        Stream<String> stream =
          Stream.generate(() -> "hello Ankit").limit(5);

        // prints hello Ankit 5 times
        stream.forEach(System.out::println);
    }
}
