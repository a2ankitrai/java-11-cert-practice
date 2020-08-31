import java.util.stream.*;
import java.util.List;


class Unordered {

  public static void main(String[] args) {
      var stream = List.of(1,2,3,4,5,6).stream().unordered();

      stream
            .forEach(System.out::print);

      System.out.println("\n--------");

      var stream2 = List.of(1,2,3,4,5,6).stream().unordered().parallel();

      stream2
            .forEach(System.out::print);
            System.out.println();


  }

}
