import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.Set;

class JavaCollectors {

    public static void main(String[] args) {
      Stream<String> stream = Stream.of("w","o","l","f!");

      TreeSet<String> treeSet = stream.collect(Collectors.toCollection(TreeSet::new));

      System.out.println(treeSet);

      System.out.println("--------------------");

      Stream<String> stream2 = Stream.of("w","o","l","f!");

      Set<String> set = stream2.collect(Collectors.toSet());

      System.out.println(set);

    }
}
