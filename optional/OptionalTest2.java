import java.util.Optional;

class OptionalTest2 {

  public static Optional<Double> average(int... scores)
  {
    if (scores.length == 0) return Optional.empty();
    int sum = 0;
    for (int score: scores) sum += score;
    return Optional.of((double) sum / scores.length);
  }

  public static void main(String[] args) {

    Optional<Double> opt = average(90, 100);
    opt.ifPresent(System.out::println);


    Optional<Double> opt2 = average();
    opt2.ifPresent(System.out::println); // does not get printed.

    // Dealing with an Empty Optional

    System.out.println(opt2.orElse(Double.NaN));
    System.out.println(opt2.orElseGet(() -> Math.random() * 100));

  }
}
