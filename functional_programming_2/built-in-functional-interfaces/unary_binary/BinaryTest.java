import java.util.function.BinaryOperator;

class BinaryTest {

  public static void main(String[] args) {

    /*
    Notice that this does the same thing as the BiFunction example.
    The code is more succinct, which shows the importance of using the correct functional interface.
    It's nice to have one generic type specified instead of three.
    */
    BinaryOperator<String> b1 = String::concat;
    BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

    System.out.println(b1.apply("Java", "Life"));
    System.out.println(b2.apply("Java", "Life"));

  }
}
