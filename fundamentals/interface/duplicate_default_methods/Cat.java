interface Walk {

  public default int getSpeed(){
    return 5;
  }
}

interface Run {
  public default int getSpeed(){
    return 10;
  }
}

public class Cat implements Walk, Run {

  public int getSpeed() { return 1; }

  public int getWalkSpeed() { return Walk.super.getSpeed(); }

  public int getRunSpeed() { return Run.super.getSpeed(); }

  public static void main(String[] args) {

    Cat cat = new Cat();

    System.out.println("overriden Speed: " + cat.getSpeed());
    System.out.println("walk Speed: " + cat.getWalkSpeed());
    System.out.println("run Speed: " + cat.getRunSpeed());
  }
}
