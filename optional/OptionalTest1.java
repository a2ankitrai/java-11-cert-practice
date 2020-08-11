import java.util.Optional;

class OptionalTest1 {

  public static Optional<Double> average(int... scores)
  {
    if (scores.length == 0) return Optional.empty();
    int sum = 0;
    for (int score: scores) sum += score;
    return Optional.of((double) sum / scores.length);
  }

  public static void main(String[] args) {

    System.out.println(average(90,100)); // Optional[95.0]

    System.out.println(average()); // Optional.empty

    Optional<Double> opt1 = average(90,100);
    System.out.println(opt1.get());

    Optional<Double> opt2 = average();
    System.out.println(opt2.get());// // java.util.NoSuchElementException: No value present

  }
}
