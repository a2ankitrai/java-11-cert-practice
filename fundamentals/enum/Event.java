public enum Event {

  ONCE(true), TWICE(true), THRICE(true);

  private Event(boolean b){
    System.out.println("constructing Event..");
  }
}
