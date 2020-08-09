import java.util.function.BiPredicate;

class BiPredicateTest {

  public static void main(String[] args) {
    BiPredicate<String, String> b1 = String::startsWith;
    BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

    System.out.println(b1.test("chicken", "chick"));  // true
    System.out.println(b2.test("chicken", "chick"));  // true

  }
}
