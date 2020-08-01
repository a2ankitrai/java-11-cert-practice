
/**
Sprint interface is a functional interface, because it contains exactly one abstract method.
*/
@FunctionalInterface
interface Sprint{
  public void sprint(int speed);
}

public class Tiger implements Sprint{

  public void sprint(int speed){
    System.out.println("Animal is sprinting fast !! : " + speed);
  }

  public static void main(String[] args) {
    Tiger t = new Tiger();
    t.sprint(5);
  }
}
