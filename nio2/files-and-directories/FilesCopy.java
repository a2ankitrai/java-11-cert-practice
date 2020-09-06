import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

class FilesCopy {

  public static void main(String[] args) {

    try {
      Files.copy(Path.of("./a/file.txt"),Path.of("./a-copy/hello.txt"));
    } catch(Exception e) {
      e.printStackTrace();
    }

    try {
      Files.copy(Path.of("./a"),Path.of("./b"));
    } catch(Exception e) {
      e.printStackTrace();
    }


  }
}
