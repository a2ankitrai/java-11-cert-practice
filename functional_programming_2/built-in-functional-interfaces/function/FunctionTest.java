import java.util.function.Function;
import java.util.function.BiFunction;

class FunctionTest {

  public static void main(String[] args) {

    Function<String,Integer> f1 = String::length;
    Function<String,Integer> f2 = s -> s.length();

    System.out.println(f1.apply("Clock"));
    System.out.println(f2.apply("Clock"));


    BiFunction<String, String, String> b1 = String::concat;
    BiFunction<String, String, String> b2 = (s1,s2) -> s1.concat(s2);

    System.out.println(b1.apply("Java", "Life"));
    System.out.println(b2.apply("Java", "Life"));

  }
}
