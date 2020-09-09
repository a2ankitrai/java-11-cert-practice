import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;
import java.io.IOException;

class FilesWalkDirectorySize {

private static long getSize(Path p) {
        try {
                return Files.size(p);
        } catch (IOException e) {
                // Handle exception
        }
        return 0L;
}

public static long getPathSize(Path source) throws IOException {
        try (var s = Files.walk(source)) {
                return s.parallel()
                       .filter(p -> !Files.isDirectory(p))
                       .mapToLong(FilesWalkDirectorySize::getSize)
                       .sum();
        }
}

  public static void main(String[] args) throws IOException{

      Path path  = Path.of("./a");
      System.out.println(getPathSize(path));

      System.out.println("-----------");

      try(Stream<Path> ps = Files.walk(path)) {
          ps.forEach(System.out::println);
      }

      System.out.println("-----------");

      try(Stream<Path> ps = Files.walk(path,2)) {
          ps.forEach(System.out::println);
      }

  }

}
