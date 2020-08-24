import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class CollectorPartitioning {

    public static void main(String[] args) {

        var list = List.of(1,2,3,4,5,6);

        Map<Boolean, List<Integer>> map =
            list.stream()
                .collect(
                    Collectors.partitioningBy(x -> x%2 == 0));

        System.out.println(map); // {false=[1, 3, 5], true=[2, 4, 6]}


        var list2 = List.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map2 =
            list2.stream().collect(
                Collectors.partitioningBy(s -> s.length() <= 7,
                                                Collectors.toSet()));
        System.out.println(map2); // {false=[], true=[lions, bears, tigers]}

        Map<Integer, Long> map3 =
          list2.stream()
             .collect(Collectors.groupingBy(String::length,
                                            Collectors.counting()));
        System.out.println(map3); // {5=2, 6=1}


        Map<Integer, Optional<Character>> map4 = list2.stream().collect(
        Collectors.groupingBy(
            String::length,
            Collectors.mapping(
                s -> s.charAt(0),
                Collectors.minBy((a, b) -> a-b))));
        System.out.println(map4); // {5=Optional[b], 6=Optional[t]}


    }
}
