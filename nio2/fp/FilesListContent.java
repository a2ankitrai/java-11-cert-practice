import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.io.IOException;

class FilesListContent {

  public static void main(String[] args) throws IOException{

    Path path = Path.of("../files-and-directories/a");

    try(Stream<Path> s = Files.list(path)) {

        s.forEach(System.out::println);
    }

  }

}
