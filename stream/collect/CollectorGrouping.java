import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class CollectorGrouping {

    public static void main(String[] args) {

      var list = List.of("lions", "tigers", "bears");

      System.out.println("Grouping by");
      Map<Integer,List<String>> map =
          list.stream()
              .collect(Collectors.groupingBy(String::length));
      System.out.println(map);

      System.out.println("-----------------------");
      System.out.println("Mapping the value to a Set");

      var list2 = List.of("one","one","two","two","three","three");
      Map<Integer, Set<String>> map2 =
          list2.stream()
               .collect(Collectors.groupingBy(String::length,
                                              Collectors.toSet()));

      System.out.println(map2); // {3=[one, two], 5=[three]}

      System.out.println("------------------------");
      System.out.println("Change the type of Map returned ");

      var list3 = List.of("three","three","four","four","one","one","two","two");
      Map<Integer, Set<String>> map3 =
          list3.stream()
               .collect(Collectors.groupingBy(
                  String::length,
                  TreeMap::new,
                  Collectors.toSet()));
      System.out.println(map3); // {3=[one, two], 4=[four], 5=[three]}

      System.out.println("------------------------");
      System.out.println("Change the type of Map returned but leave the" +
       "type of values alone as a List?");

       TreeMap<Integer, List<String>> map4 =
       list3.stream()
       .collect(Collectors.groupingBy(
                          String::length,
                          TreeMap::new,
                          Collectors.toList()));
       System.out.println(map4);


    }
}
