public class Test7 extends Bar implements Foo{

  public static void main(String[] args) {

    System.out.println(name);
  }

}

interface Foo{

String name = "Foo";

}

class Bar {
static String name = "Bar";

}
