import java.util.stream.Stream;
import java.util.List;
import java.util.Comparator;

class StreamSorted {

  public static void main(String[] args) {

      Stream<String> s1 = Stream.of("brown-","bear-");

      s1.sorted()
        .forEach(System.out::print);

      System.out.println("\n--------------");

      Stream<String> s2 = Stream.of("brown-","grizzly-","bear-");

      //   s2.sorted(Comparator::reverseOrder)
      s2.sorted(Comparator.reverseOrder())
        .forEach(System.out::print);


      System.out.println();
  }
}
