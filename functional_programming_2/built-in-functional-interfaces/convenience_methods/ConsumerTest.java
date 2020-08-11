import java.util.function.Consumer;

class ConsumerTest {

  public static void main(String[] args) {


    Consumer<String> c1 = x -> System.out.print("1: " + x);
    Consumer<String> c2 = x -> System.out.print(",2: " + x);

    Consumer<String> combined = c1.andThen(c2);

    combined.accept("Annie"); // 1: Annie,2: Annie

    System.out.println();

  }
}
