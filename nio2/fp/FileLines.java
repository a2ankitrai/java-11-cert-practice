import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

class FileLines {

  public static void main(String[] args) throws IOException{

      Path path = Path.of("./a/file.txt");

      try (var s = Files.lines(path)) {
        s.forEach(System.out::println);
      }

      System.out.println("\n----------\n");

      Path path2 = Path.of("./a/log/server.log");

      try(Stream<String> s = Files.lines(path2)){

        s.filter(f -> f.startsWith("WARN:"))
          .map(f -> f.substring(5))
          .forEach(System.out::println);

      }
  }

}
