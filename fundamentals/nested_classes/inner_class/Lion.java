public class Lion {

   class Cub {}
   static class Den {

      Den(){
        System.out.println("Welcome to my Den");
      }
   }
   static void rest() {
     // Note the syntax
     Lion.Den g = new Lion.Den();
   }

   public static void main(String[] args) {
     rest();

   }
}
