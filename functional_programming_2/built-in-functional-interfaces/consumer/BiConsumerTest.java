import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;

class BiConsumerTest {
  public static void main(String[] args) {

    var map = new HashMap<String, Integer>();

    /*we used an instance method reference on an object
    since we want to call a method on the local variable map.*/
    BiConsumer<String, Integer> b1 = map::put;
    BiConsumer<String, Integer> b2 = (k,v) -> map.put(k,v);

    b1.accept("chicken",7);
    b2.accept("chick", 2);

    System.out.println("map1: " + map);

    var map2 = new HashMap<String, String>();

    /*we use the same type for both generic parameters.
    */
    BiConsumer<String, String> b3 = map2::put;
    BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);

    b3.accept("chicken", "Cluck");
    b4.accept("chick", "Tweep");

    System.out.println("map2: " + map2);


  }
}
