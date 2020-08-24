import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class CollectorMapMethods {

    public static void main(String[] args) {

      var list = List.of("lions", "tigers", "bears");


      /**
      s -> s lambda expression can written as Function.identity()
      static <T> Function<T, T> identity() {
              return t -> t;
          }
      */
      // Map animal name to number of characters in name
      System.out.println("Map animal name to number of characters in name");
      Map<String, Integer> map =
        list.stream()
            .collect(
              Collectors.toMap(s -> s, String::length));

      System.out.println(map); // {lions=5, bears=5, tigers=6}

      System.out.println("-----------------------------");
      System.out.println("Map the length of the animal name to the name itself");

      Map<Integer, String> map2 =
        list.stream()
            .collect(
                Collectors.toMap(String::length,
                                  Function.identity(),
                                  (s1, s2) -> s1 + "," +s2 ));
      System.out.println(map2);
      System.out.println("Map class: " + map2.getClass());

      System.out.println("-----------------------------");
      System.out.println("Getting the result into a TreeMap");
      TreeMap<Integer, String> map3 = list.stream().collect(Collectors.toMap(
          String::length,
          k -> k,
          (s1, s2) -> s1 + "," + s2,
          TreeMap::new));
      System.out.println(map3); // {5=lions,bears, 6=tigers}
      System.out.println("Map class: " + map3.getClass()); // class java.util.TreeMap


    }
}
