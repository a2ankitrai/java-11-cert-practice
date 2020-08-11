import java.util.Optional;

class OptionalTest3 {

  public static Optional<Double> average(int... scores)
  {
    if (scores.length == 0) return Optional.empty();
    int sum = 0;
    for (int score: scores) sum += score;
    return Optional.of((double) sum / scores.length);
  }

  public static void main(String[] args) {


    // incompatible types: bad return type in lambda expression

    // Optional<Double> opt = average();
    // System.out.println(
    //   opt.orElseGet(
    //     () -> new IllegalStateException())); // DOES NOT COMPILE


    // It prints out 95.0 three times.
    //Since the value does exist, there is no need to use the “or else” logic.
    Optional<Double> opt2 = average(90, 100);
    System.out.println(opt2.orElse(Double.NaN));
    System.out.println(opt2.orElseGet(() -> Math.random()));
    System.out.println(opt2.orElseThrow());


  }
}
