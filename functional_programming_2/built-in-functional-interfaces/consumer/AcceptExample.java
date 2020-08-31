import java.util.function.BiConsumer;

class AcceptExample {

    public static void main(String[] args) {

      BiConsumer<String, String> bc = AcceptExample::concat;
      bc.accept("one", "two");

    }

    static void concat(String a, String b){
      System.out.println(a + " | " + b);
    }
}
