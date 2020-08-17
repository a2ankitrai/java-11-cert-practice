import java.util.stream.Stream;
import java.util.function.BinaryOperator;

//Optional<T> reduce(BinaryOperator<T> accumulator)
class ReduceJustAccumulator {

    public static void main(String[] args) {

      BinaryOperator<Integer> op = (a,b) -> a*b ;

      Stream<Integer> empty = Stream.empty();
      Stream<Integer> oneElement = Stream.of(1);
      Stream<Integer> threeElements = Stream.of(3,5,6);

      empty.reduce(op).ifPresent(System.out::println);
      oneElement.reduce(op).ifPresent(System.out::println);
      threeElements.reduce(op).ifPresent(System.out::println);


    }
}
