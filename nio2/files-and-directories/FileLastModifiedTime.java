import java.nio.file.*;
import java.io.IOException;

class FileLastModifiedTime {

    public static void main(String[] args) throws IOException{

      Path path = Paths.get("./a/file.txt");
      System.out.println(Files.getLastModifiedTime(path));

    }
}
