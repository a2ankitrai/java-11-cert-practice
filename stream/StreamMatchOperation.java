import java.util.stream.Stream;
import java.util.List;
import java.util.function.Predicate;

class StreamMatchOperation {

    public static void main(String[] args) {

        var list = List.of("monkey","2", "chimp");
        Stream<String> infiniteStream = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));

        // If we called `allMatch()`, it would run until we killed the program.
        System.out.println(infiniteStream.anyMatch(pred));

    }
}
