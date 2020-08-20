import java.util.stream.Stream;

class StreamSortedHang {

    public static void main(String[] args) {

      // Bad example. Comment below code if you want to run the latter
      Stream.generate(() -> "Elsa")
            .filter(n -> n.length() == 4)
            .peek(System.out::println)
            .sorted()
            .limit(2)
            .forEach(System.out::println);


      Stream.generate(() -> "Elsa")
            .filter(n -> n.length() == 4)
            .limit(2)
            .sorted()
            .forEach(System.out::println);
    }
}
