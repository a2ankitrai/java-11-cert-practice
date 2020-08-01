import java.util.function.Predicate;

public class Crow1 {

  private String color = "red";

  public void caw(String name) {
    String volume = "loudly";
    Predicate<String> p = s -> (name+volume+color).length() == 10;

    System.out.println(p.test(""));
  }

  public static void main(String[] args) {
    new Crow1().caw("a");
  }
}
