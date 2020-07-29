class Enclosing {

  static class Nested {

    private int val = 20 ;

  }

  public static void main(String[] args) {
    Nested nested  = new Nested();
    System.out.println(nested.val);

  }

}
