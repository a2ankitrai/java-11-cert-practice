import java.util.function.Predicate;

class PredicateTest {

  public static void main(String[] args) {
    Predicate<String> egg = s -> s.contains("egg");
    Predicate<String> brown = s -> s.contains("brown");


    // With Convenience methods
    Predicate<String> brownEggs = egg.and(brown);
    Predicate<String> otherEggs = egg.and(brown.negate());

    System.out.println(brownEggs.test("brown egg")); // true
    System.out.println(brownEggs.test("white egg")); // false

    System.out.println(otherEggs.test("brown egg")); // false
    System.out.println(otherEggs.test("white egg")); // true

  }
}
