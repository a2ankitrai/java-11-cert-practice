class PrintNum {

  private int length = 5;

  public void calculate(){

      int width = 4;

      class MyLocalClass {
        public void multiply(){
          System.out.println(length * width);
        }
      }

      /**
      local variables referenced from an inner class must be final or effectively final
      */
      //width = 5;

      MyLocalClass localClass = new MyLocalClass();

      localClass.multiply();
  }

  public static void main(String[] args) {
    PrintNum obj = new PrintNum();
    obj.calculate();
  }
}
