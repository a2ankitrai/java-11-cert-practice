class ZooGiftShop {

 // This could also have been an interface.
  abstract class SaleTodayOnly {
    abstract int dollarOff();
  }

  public int admission(int basePrice){

    /**
    Pay special attention to statement ending with semicolon.
    We are declaring a local variable on these lines.
    Local variable declarations are required to end with semicolons,
    just like other Java statements—even if they are long and
    happen to contain an anonymous class.
    */

    SaleTodayOnly sale = new SaleTodayOnly(){
      int dollarOff(){
        return 5;
      }
    };


    return basePrice - sale.dollarOff();
  }

  public static void main(String[] args) {

    ZooGiftShop obj = new ZooGiftShop();

    System.out.println(obj.admission(20));
  }
}
