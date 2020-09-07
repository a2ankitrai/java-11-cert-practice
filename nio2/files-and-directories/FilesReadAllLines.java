import java.nio.file.*;
import java.util.List;

class FilesReadAllLines {

  public static void main(String[] args) throws Exception{

    Path path = Path.of("./a/file.txt");
    final List<String> lines = Files.readAllLines(path);
    lines.forEach(System.out::println);

  }

}
