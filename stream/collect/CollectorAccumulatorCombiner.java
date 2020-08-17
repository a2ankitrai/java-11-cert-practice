import java.util.stream.Stream;
import java.util.TreeSet;

/*<R> R collect(Supplier<R> supplier,
   BiConsumer<R, ? super T> accumulator,
   BiConsumer<R, R> combiner)
*/
class CollectorAccumulatorCombiner {

  public static void main(String[] args) {

    Stream<String> stream = Stream.of("w","o","l","f!");

    StringBuilder sb = stream.collect(
      StringBuilder::new,
      StringBuilder::append,
      StringBuilder::append
    );

    System.out.println(sb);

    System.out.println("----------------");

    // example where the logic is different in the accumulator and combiner
      Stream<String> stream2 = Stream.of("w","o","l","f!");

      TreeSet<String> treeSet = stream2.collect(
        TreeSet::new,
        TreeSet::add,
        TreeSet::addAll
      );
      System.out.println(treeSet);

  }
}
