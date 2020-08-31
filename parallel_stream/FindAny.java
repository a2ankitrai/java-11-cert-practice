import java.util.stream.*;
import java.util.List;

class FindAny {

    public static void main(String[] args) {

      var list = List.of(1,2,3,4,5,6);

      System.out.println("-----Serial Stream findAny()------");
      System.out.println(list.stream()
        .findAny()
        .get());

      System.out.println("---------------");
      System.out.println("-----Parallel Stream findAny()------");

      System.out.println(list.parallelStream()
        .findAny()
        .get());

    }
}
