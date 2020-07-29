class ZooGiftShop2 {

  interface SaleTodayOnly {
   int dollarOff();
  }

  public int admission(int basePrice, SaleTodayOnly sale){
    return basePrice - sale.dollarOff();
  }

  public int pay(){
    return admission(20, new SaleTodayOnly(){
      public int dollarOff(){
        return 5;
      }
    });
  }

  public static void main(String[] args) {

    ZooGiftShop2 obj = new ZooGiftShop2();

    System.out.println(obj.pay());
  }
}
