import java.util.List;

class Reduce {

  public static void main(String[] args) {

    var list = List.of('a','n','k','i','t');

    System.out.println(list.stream() // or parallelStream()
          .parallel()
          .reduce("",
                  (s,c) -> s+c,
                  (s1,s2) -> s1+s2));

  }
}
