import java.util.function.Function;

class FunctionTest {

  public static void main(String[] args) {

    Function<Integer, Integer> f1 = x -> x+1;
    Function<Integer, Integer> f2 = x -> x*2;

    // chains sequentially
    Function<Integer, Integer> f3 = f1.andThen(f2);

    // now f1 is run first, turning 3 into 4 and then f2 runs, doubling to 8
    Function<Integer, Integer> f4 = f2.compose(f1);

    System.out.println(f3.apply(3)); // 8
    System.out.println(f4.apply(3)); // 8


  }
}
