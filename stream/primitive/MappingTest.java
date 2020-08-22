import java.util.stream.*;

class MappingTest {

    public static void main(String[] args) {

      System.out.println("mapToInt");

      Stream<Integer> s = Stream.of(1,2,3);
      IntStream is = s.mapToInt(x -> x);
      is.forEach(System.out::println);

      System.out.println("-----------");
      System.out.println("mapToDouble");

      Stream<Integer> s1 = Stream.of(1,2,3);
      DoubleStream ds = s1.mapToDouble(x -> x);
      ds.forEach(System.out::println);

      System.out.println("-----------");
      System.out.println("mapToLong");

      Stream<Integer> s2 = Stream.of(1,2,3);
      LongStream ls = s2.mapToLong(x -> x);
      ls.forEach(System.out::println);


    }
}
