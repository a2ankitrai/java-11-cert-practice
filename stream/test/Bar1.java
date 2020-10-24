
public class Bar1 implements Foo {
    String name = "Bar";
    String roll = "BaarRool";

    public void print() {
        System.out.println(name); // Line 1
    }

    public static void main(String[] args) {
        Foo foo = new Bar1(); // Line 2
        foo.print(); // Line 3

        System.out.println(foo.roll);
    }
}

interface Foo {
   String name = "Foo";

   String roll = "Rool";

   void print();
}
