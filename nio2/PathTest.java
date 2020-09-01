import java.nio.file.Path;
import java.nio.file.Paths;

class PathTest {

  public static void main(String[] args) {

      Path path = Path.of(".", "sample.txt");

      System.out.println(path.toString());

      Path path2 = Paths.get("./sample.txt");

      System.out.println(path2);
  }
}
