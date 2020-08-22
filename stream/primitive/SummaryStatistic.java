import java.util.stream.*;
import java.util.IntSummaryStatistics;

class SummaryStatistic {

  public static void main(String[] args) {

      IntStream is = IntStream.of(1,2,3,4,5);
      IntSummaryStatistics iss = is.summaryStatistics();
      int range = iss.getMax() - iss.getMin();
      System.out.println(range);

      IntStream is2 = IntStream.empty();
      IntSummaryStatistics iss2 = is2.summaryStatistics();
      // if(iss2.getCount() == 0){
      //   throw new RuntimeException();
      // }
      System.out.println("getMax: " + iss2.getMax()); // getMax: -2147483648
      System.out.println("getMin: " + iss2.getMin()); // getMin: 2147483647
      System.out.println("getSum: " + iss2.getSum()); // getSum: 0
      System.out.println("getCount: " + iss2.getCount()); // getCount: 0

  }

}
