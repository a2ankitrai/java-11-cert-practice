import java.nio.file.Path;
import java.nio.file.Paths;

class PathRelativize {

    public static void main(String[] args) {

      var path1 = Path.of("fish.txt");
      var path2 = Path.of("friendly/birds.txt");
      System.out.println(path1.relativize(path2));
      System.out.println(path2.relativize(path1));

      System.out.println("------------");

      var path3 = Path.of("/var/habitat");
      var path4 = Path.of("/var/sanctuary/raven/poe.txt");
      System.out.println(path3.relativize(path4));
      System.out.println(path4.relativize(path3));

      System.out.println("------------");

      var path5 = Path.of("/var/habitat");
      var path6 = Path.of("/home/sanctuary/raven/poe.txt");
      System.out.println(path5.relativize(path6));
      System.out.println(path6.relativize(path5));

      System.out.println("------------");

      Path path7 = Paths.get("/primate/chimpanzee");
      Path path8 = Paths.get("bananas.txt");
      path7.relativize(path8); // IllegalArgumentException
    }
}
