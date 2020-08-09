// Example for an abstract inner class implementation
class Outer2 {

  private String greeting = "Hello";

  abstract class Inner2 {

    public int repeat = 3;

    public Inner2(){
      System.out.println("constructor called.");
    }

    public  abstract void go();
    // {
    //   for(int i = 0; i<3; i++){
    //     System.out.println(greeting);
    //   }
    // }
  }

  public static void main(String[] args) {

    System.out.println("-------------");
    Outer2 outer2 = new Outer2();
    InnerExtender obj = new InnerExtender(outer2);
    obj.go();


  }
}

class InnerExtender extends Outer2.Inner2 {

InnerExtender (Outer2 outer){
  outer.super();
}

  public  void go()
  {
    for(int i = 0; i<3; i++){
      System.out.println("greeting");
    }
  }
}
