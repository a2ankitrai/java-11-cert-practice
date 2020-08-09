import java.util.function.UnaryOperator;

class UnaryTest {

  public static void main(String[] args) {

    /* We don't need to specify the return type in the generics
      because UnaryOperator requires it to be the same as the parameter.*/

    UnaryOperator<String> u1 = String::toUpperCase;
    UnaryOperator<String> u2 = s -> s.toUpperCase();

    System.out.println(u1.apply("i am in caps"));
    System.out.println(u2.apply("i am in caps"));
  }
}
