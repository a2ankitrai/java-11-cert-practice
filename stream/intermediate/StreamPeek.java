import java.util.stream.Stream;
import java.util.List;

class StreamPeek {

  public static void main(String[] args) {

    var stream = Stream.of("black bear", "brown bear", "grizzly");
    long count = stream.filter(s -> s.startsWith("g"))
                    .peek(System.out::println).count();  // grizzly

    System.out.println(count);                          // 1

  }
}
