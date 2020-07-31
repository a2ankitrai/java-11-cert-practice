interface Hop {

  /** The method getJumpHeight() works just like a static method as defined in a class.
  In other words, it can be accessed without an instance of a class using the Hop.getJumpHeight() syntax.
  Since the method was defined without an access modifier, the compiler will automatically insert the public access modifier.
  **/
  static int getJumpHeight() {
    return 10;
  }
}

interface Leap {
  static int getJumpHeight(){
    return 50;
  }
}

public class Bunny
  // implements Hop // this is not required if we just want to access static methods.
{

  public static void main(String[] args) {

    /**
    Without an explicit reference to the name of the interface, the code will not compile, even though Bunny implements Hop.
    **/
    // System.out.println(getJumpHeight()); // DOES NOT COMPILE

    System.out.println(Hop.getJumpHeight());

    System.out.println(Leap.getJumpHeight());
  }
}
