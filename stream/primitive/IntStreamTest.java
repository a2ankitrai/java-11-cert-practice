import java.util.stream.*;

class IntStreamTest {

  public static void main(String[] args) {
      IntStream  is = IntStream.range(1,21);

      System.out.println(is.summaryStatistics());
  }
}
