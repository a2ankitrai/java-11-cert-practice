import java.util.stream.Stream;

class ReduceAccumulateCombine  {

  public static void main(String[] args) {

    Stream<String> stream = Stream.of("w","o","l","f!");
    int length = stream.reduce(0,
                               (i, s) -> i+s.length(),
                               (a, b) -> a+b);

    System.out.println(length);

  }
}
