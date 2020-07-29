class Outer {

  private String greeting = "Hello";

  protected class Inner {

    public int repeat = 3;

    public Inner(){
      System.out.println("constructor called.");
    }

    public void go(){
      for(int i = 0; i<3; i++){
        System.out.println(greeting);
      }
    }
  }

  public void callInner(){

    Inner inner = new Inner();
    inner.go();
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.callInner();
    System.out.println("-------------");

    Inner inner1 = outer.new Inner();
    inner1.go();
    System.out.println("-------------");
    Inner inner2 = outer.new Inner();
    inner2.go();

  }
}
