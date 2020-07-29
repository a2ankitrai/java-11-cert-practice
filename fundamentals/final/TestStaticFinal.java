class TestStaticFinal {

  final static String name = "Jack";
  static final int bamboo;
  static final double height; // DOES NOT COMPILE

  static {
    bamboo = 5;
    //height = 2.2;
  }

}
