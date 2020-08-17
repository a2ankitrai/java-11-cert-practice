import java.util.stream.Stream;

//T reduce(T identity, BinaryOperator<T> accumulator)
class ReduceConcatenate {

  public static void main(String[] args) {

    Stream<String> stream1 =  Stream.of("a", "n", "k", "i", "t");

    System.out.println(stream1.reduce("",(s,c) -> s+c));

    System.out.println("----------");

    Stream<String> stream2 =  Stream.of("a", "n", "k", "i", "t");
    System.out.println(stream2.reduce("",String::concat));

  }
}
