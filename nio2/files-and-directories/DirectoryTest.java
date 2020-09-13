import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

class DirectoryTest {

      public static void main(String[] args) throws Exception{

          /**
          * creates the directory green along with any of the following
          parent directories if they do not already exist, including bison,
          field, and pasture.
          */
          Files.createDirectories(Path.of("./bison/field/pasture/green"));

          /**
          * creates a new directory, pond, in the directory
            /bison, assuming /bison exists; or else an exception is thrown.
          */
          Files.createDirectory(Path.of("./bison/pond"));

          Files.createDirectory(Path.of("./tiger/pond")); // java.nio.file.NoSuchFileException
      }
}
