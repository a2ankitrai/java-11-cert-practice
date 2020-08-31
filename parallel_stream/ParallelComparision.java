import java.util.List;

class ParallelComparision {

  private static int doWork(int input){
    try{
      Thread.sleep(2000);
    } catch(InterruptedException e){}

      return input;
  }

  public static void main(String[] args) {

    System.out.println("Serial Stream");
    long s1 = System.currentTimeMillis();
    List.of(1,2,3,4,5)
        .stream()
        .map(w -> doWork(w))
        .forEach(s -> System.out.print(s +" "));

    System.out.println();
    var timeTaken = (System.currentTimeMillis()-s1)/1000;
    System.out.println("Time taken: "+ timeTaken +" seconds");

    System.out.println("----------------------");
    System.out.println("Parallel Stream");

    long s2 = System.currentTimeMillis();
    List.of(1,2,3,4,5)
        .parallelStream()
        .map(w -> doWork(w))
        .forEach(s -> System.out.print(s +" "));

    System.out.println();
    var timeTaken2 = (System.currentTimeMillis()-s2)/1000;
    System.out.println("Time taken: "+ timeTaken2 +" seconds");

  }

}
