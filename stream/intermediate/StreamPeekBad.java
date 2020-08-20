import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class StreamPeekBad {

    public static void main(String[] args) {

      var numbers = new ArrayList<>();
      var letters = new ArrayList<>();

      numbers.add(1);
      letters.add('a');

      Stream<List<?>> stream = Stream.of(numbers, letters);

      stream.map(List::size)
            .forEach(System.out::print);

      System.out.println();


      Stream<List<?>> bad = Stream.of(numbers, letters);
      bad.peek(x -> x.remove(0))
          .map(List::size)
          .forEach(System.out::print);


     System.out.println();

    }
}
