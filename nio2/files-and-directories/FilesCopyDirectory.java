import java.nio.file.*;

class FilesCopyDirectory {

    public static void main(String[] args) {

      var file = Paths.get("./a/file.txt");

      var enclosure = Paths.get("./enclosure").resolve("file.txt");

      try {
        Files.copy(file, enclosure, StandardCopyOption.REPLACE_EXISTING);
      } catch(Exception e) {
        e.printStackTrace();
      }

    }
}
