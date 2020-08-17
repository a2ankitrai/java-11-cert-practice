import java.util.stream.Stream;

class ReduceAccumulate {

  public static void main(String[] args) {

    Stream<Integer> stream = Stream.of(3,5,6);

    System.out.println(stream.reduce(1,(a,b) -> a*b));

    System.out.println("------");

    // Below prints 1 even when the stream is empty.
    Stream<Integer> stream2 = Stream.empty();
    System.out.println(stream2.reduce(1,(a,b) -> a*b));

  }
}
