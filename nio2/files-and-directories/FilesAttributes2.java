import java.nio.file.*;
import java.io.IOException;

class FilesAttributes2 {

    public static void main(String[] args) throws IOException{

      Path path = Paths.get("./a/bear.txt");

      System.out.println(Files.isHidden(path));
      System.out.println(Files.isReadable(path));
      System.out.println(Files.isWritable(path));
      System.out.println(Files.isExecutable(path));

      System.out.println("-----------------");

      System.out.println(Files.isHidden(Paths.get("./a/file-hidden.txt")));
    }
}
