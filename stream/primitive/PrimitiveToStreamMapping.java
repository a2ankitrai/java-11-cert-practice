import java.util.stream.*;

class PrimitiveToStreamMapping {

    public static void main(String[] args) {

      System.out.println("mapToObj");
      IntStream is1 = IntStream.of(1,2,3);
      Stream<Integer> s1 = is1.mapToObj(x -> x);
      s1.forEach(System.out::println);

      System.out.println("---------------");
      System.out.println("boxed");

      IntStream is2 = IntStream.of(4,5,6);
      Stream<Integer> s2 = is2.boxed();
      s2.forEach(System.out::println);

    }

}
