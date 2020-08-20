import java.util.stream.Stream;
import java.util.List;

/*
that we wanted to get the first two names of our friends alphabetically
that are four characters long.
*/
class PipelineExample1 {

  public static void main(String[] args) {
      var list = List.of("Toby", "Anna", "Leroy", "Alex");

      list.stream()
          .filter(s -> s.length() == 4)
          .sorted()
          .limit(2)
          .forEach(System.out::println);
  }
}
