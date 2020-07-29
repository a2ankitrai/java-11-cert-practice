public class TestFinal {

  public void localmethod1(boolean val){

    final int a = 5;
    final int b;

    if(val){
      b = 10;
    }
    /**
    removing the else part will throw below compilation error
    TestFinal.java:15: error: variable b might not have been initialized
        System.out.println("a: " + a + ", b: "+b);
                                               ^
    1 error
    */
    else{
      b = 15;
    }

    /**
    TestFinal.java:22: error: cannot assign a value to final variable a
        a = 50;
        ^
    1 error
    */
    //a = 50;

    System.out.println("a: " + a + ", b: "+b);

  }

  public static void main(String[] args) {

    TestFinal obj = new TestFinal();
    obj.localmethod1(false);

  }

}
