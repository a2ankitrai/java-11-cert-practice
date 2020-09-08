import java.nio.file.*;
import java.io.IOException;

class FileSize {

    public static void main(String[] args) throws IOException{

      Path path = Paths.get("./a/bear.txt");
      System.out.println(Files.size(path));

      Path path2 = Paths.get("./a");
      System.out.println(Files.size(path2)); 
    }
}
