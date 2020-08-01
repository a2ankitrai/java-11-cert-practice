import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;


class TraditionalSearch {

  public static void main(String[] args) {

    var animals = new ArrayList<Animal>();
    animals.add(new Animal("fish",     false, true));
    animals.add(new Animal("kangaroo", true,  true));
    animals.add(new Animal("rabbit",   true,  false));
    animals.add(new Animal("turtle",   false, true));

    System.out.println("Can hop: ");
    print(animals, a -> a.canHop());
    System.out.println();

    System.out.println("Can Swim: ");
    print(animals, a -> a.canSwim());
    System.out.println();

    System.out.println("Can NOT Swim: ");
    print(animals, a -> !a.canSwim());
    System.out.println();

  }

  private static void print(List<Animal> animals, Predicate<Animal> checker){

    for(Animal a : animals){

      if(checker.test(a)){
        System.out.println(a + " ");
      }
    }
  }

}
