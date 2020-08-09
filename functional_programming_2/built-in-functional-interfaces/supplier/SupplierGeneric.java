import java.util.function.Supplier;
import java.util.ArrayList;

class SupplierGeneric {

  public static void main(String[] args) {

      Supplier<ArrayList<String>> s1 = ArrayList<String>::new;

      ArrayList<String> a1 = s1.get();

      // []
      System.out.println(a1);

      // Prints SupplierGeneric$$Lambda$1/0x0000000800060840@6bc168e5
      System.out.println(s1);
  }
}
