import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;
import java.io.IOException;

class FilesListDeepCopy {

    public static void deepCopy(Path source, Path target){

      try {

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        if (Files.isDirectory(source)) {

            try(Stream<Path> s = Files.list(source)) {
                s.forEach( p -> deepCopy(p, target.resolve(p.getFileName())));
            }
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }

    public static void main(String[] args) {

        Path source = Path.of("../files-and-directories/a");
        Path target = Path.of("./a");

        System.out.println("Starting deep copy");
        deepCopy(source, target);
        System.out.println("Deep copy completed");
    }

}
