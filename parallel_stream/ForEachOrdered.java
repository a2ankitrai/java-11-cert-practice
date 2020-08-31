import java.util.List;

class ForEachOrdered {

  private static int doWork(int input){
    try{
      Thread.sleep(2000);
    } catch(InterruptedException e){}

      return input;
  }

  public static void main(String[] args) {

    long s1 = System.currentTimeMillis();
    List.of(5,4,3,2,1)
        //  .stream()
        .parallelStream()
        .map(w -> doWork(w))
        .forEachOrdered(s -> System.out.print(s +" "));

    System.out.println();
    var timeTaken = (System.currentTimeMillis()-s1)/1000;
    System.out.println("Time taken: "+ timeTaken +" seconds");
  }

}
