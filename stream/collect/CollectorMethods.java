import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class CollectorMethods {

    public static void main(String[] args) {

      List<Integer> list = List.of(1,2,3,4,5);

      System.out.println("Averaging");
      // Calculates the average for our three core primitive types
      System.out.println(list.stream()
        .collect(Collectors.averagingDouble(x -> x)));

      System.out.println(list.stream()
        .collect(Collectors.averagingInt(x -> x)));

      System.out.println(list.stream()
        .collect(Collectors.averagingLong(x -> x)));

      System.out.println("--------------------------");
      // counting number of elements
      System.out.println("Counting");
      System.out.println(list.stream().collect(Collectors.counting()));


      System.out.println("--------------------------");
      System.out.println("Joining");
      // joining
      System.out.println(list.stream()
        .map(x -> ""+x)
        .collect(Collectors.joining("*")));

      System.out.println("--------------------------");
      System.out.println("maxBy / minBy");

      System.out.println("maxBy: " + list.stream()
        .collect(Collectors.maxBy((a,b) -> a-b )));

      System.out.println("minBy: " + list.stream()
        .collect(Collectors.maxBy(Comparator.reverseOrder()))  );


    }
}
