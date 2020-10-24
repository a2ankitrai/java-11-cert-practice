import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        Item i1 = new Item(Tag.CHEAP, 5.0);
        Item i2 = new Item(Tag.NORMAL, 10.0);
        Item i3 = new Item(Tag.NORMAL, 15.0);

        List<Item> items = List.of(i1, i2, i3);

        items.stream()
              .filter(i -> i.price > 5.0)
              .forEach(i -> i.tag = Tag.EXPENSIVE);

        items.stream()
              .forEach(i -> i.tag = Tag.BS);      

        items.stream()
              .forEach(i -> System.out.println(i.tag));
    }
}

class Item {

    Tag tag;
    double price;

    Item(Tag tag, double price){
      this.tag = tag;
      this.price = price;
    }

    public Tag getTag(){
      return tag;
    }

    public double getPrice(){
      return price;
    }
}

enum Tag {
  EXPENSIVE, NORMAL, CHEAP, BS
}
