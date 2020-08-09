import java.util.function.Predicate;

class PredicateTest {
  public static void main(String[] args) {

    Predicate<String> p1 = String::isEmpty;
    Predicate<String> p2 = x -> x.isEmpty();

    System.out.println(p1.test(""));  // true
    System.out.println(p2.test(""));  // true

  }
}
