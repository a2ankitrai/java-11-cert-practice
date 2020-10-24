import java.util.stream.Stream;
import java.util.Optional;

class OptionalOrElseMethod {

  static int i;

  static int increase(){
    return ++i;
  }

  public static void main(String[] args) {
    // int j = Stream.of(0)
    //.findAny()

    int j = Optional.of(0)
    .orElse(increase());

    System.out.println(i+ " " + j); // 1 0 - increase() is always called.
  }
}
