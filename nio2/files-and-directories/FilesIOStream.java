import java.nio.file.*;
import java.io.*;

class FilesIOStream {

  public static void main(String[] args) {

    /**
      While we used FileInputStream, the streams could have been any valid
      I/O stream including website connections, in-memory stream resources,
      and so forth.
    */
    try (var is = new FileInputStream("./a/wolf.txt")) {
        // Write stream data to a file
        Files.copy(is, Paths.get("./a/wolf-cp.txt"),
        StandardCopyOption.REPLACE_EXISTING);
    } catch (Exception e) {
      e.printStackTrace();
    }

    /**
      Prints the contents of a file directly to the System.out stream.
    */
    try{
    Files.copy(Paths.get("./a/wolf-cp.txt"), System.out);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
